/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author danii
 */
public class Imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double e = metodo("Introduce tu estatura: ");
       double p = metodo("Introduce tu peso: ");
       double imc = p/(Math.pow(e, 2));
       if (imc<18.5){
           JOptionPane.showMessageDialog(null,"Tu imc es de: "+ imc+" Tienes un peso bajo");
           
       }
       if ((imc>=18.5) &(imc<25)){
           JOptionPane.showMessageDialog(null,"Tu imc es de: "+ imc+" Tienes un peso normal");
           
       }
       if (imc>=25){
           JOptionPane.showMessageDialog(null,"Tu imc es de: "+ imc+" Tienes sobrepeso");
           
       }
    }
    
    public static double metodo (String men){
        double dato=0;
        boolean flag;
        do{
            try{
                String usuario = JOptionPane.showInputDialog(men);
                dato=Double.parseDouble(usuario);
                flag=false;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error");
                flag=true;
            }
        }
        while(flag);
        return dato;
    }
    
}
