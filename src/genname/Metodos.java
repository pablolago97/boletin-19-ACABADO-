/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genname;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Metodos {
    
     char abc[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
     
     private int i;
     
     public String s_nombre(){
         String cod = "";
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
       nombre = nombre.toLowerCase();
        for (i=0;i<nombre.length();i++){
            char letra = nombre.charAt(i);
            cod = cod + cambia_letra(letra);
            
        }
         return cod;
     }
     
     public String cambia_letra (char letra){
         
         int j;
         
         String vuelta="";
         
             switch(letra){
                 
                 case 'a': 
                     vuelta = "";
                     break;
                    
                 case 'b':
                     vuelta = "ve";
                     break;
                     
                 case 'c':
                     vuelta = "nexx";
                   break;
                     
                 case 'd':
                     vuelta = "thal";
                     break;
                     
                 case 'e':
                     vuelta = "";
                     break;
                     
                 case 'f':
                     vuelta = "mor";
                     break;
                     
                 case 'g':
                     vuelta = "ev";
                     break;
                     
                 case 'h':
                     vuelta = "ly";
                     break;
                     
                 case 'i':
                     vuelta = "";
                     break;
                     
                 case 'j':
                     vuelta = "gul";
                     break;
                     
                 case 'k':
                     vuelta = "ran";
                     break;
                     
                 case 'l':
                     vuelta = "gax";
                     break;
                     
                 case 'm':
                     vuelta = "thund";
                     break;
                     
                 case 'n':
                     vuelta = "lew";
                     break;
                     
                 case 'o':
                     vuelta = "";
                     break;
                     
                 case 'p':
                     vuelta = "de";
                     break;
                  
                 case 'q':
                     vuelta = "khu";
                     break;
                     
                 case 'r':
                     vuelta = "zior";
                     break;
                 
                 case 's':
                     vuelta = "tik";
                     break;
                  
                 case 't':
                     vuelta = "sekk";
                     break;
                 
                 case 'u':
                     vuelta = "";
                     break;
                 
                 case 'v':
                     vuelta = "gax";
                     break;
                    
                 case 'w':
                     vuelta = "sree";
                     break;
                     
                 case 'x':
                     vuelta = "som";
                     break;
                     
                 case 'y':
                     vuelta = "yhi";
                     break;
                  
                 case 'z':
                     vuelta = "zhet";
                     break;
                 case 'ñ':
                     vuelta = "cath";
                     break;
                     
                             
                     
                     
                     
                 default: JOptionPane.showMessageDialog(null,"Has escrito un caracter incorrecto");break;
                     
                     
             }
         return vuelta;
     
     }
}
