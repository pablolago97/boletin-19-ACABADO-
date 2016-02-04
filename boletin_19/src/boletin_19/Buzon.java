/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_19;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
/**
 *
 * @author plago-bergonpazos
 */
public class Buzon {
    boolean y = false;
    
    ArrayList <Correo> msgs = new ArrayList();
    
    public int numeroDeCorreos(){
       return msgs.size();
    }
    
    public void engade(Correo c){
        msgs.add(c); 
    }
    
    public boolean porLer(){
        
    
        int i;
                for(i=0;i<msgs.size();i++){
                    if (msgs.get(i).isX() == true){
                         //System.out.println("Quedan por leer");
                        y = true;
                    }
                }
             return y;
    }
    
    
    public String AmosaPrimerNoLeido(){
        int i;
        String amosa = "";
        for (i = 0; i<msgs.size(); i++){
            if (msgs.get(i).isX() == true){
                return msgs.get(i).getCorreo();
            }
        } 
        return amosa = "Están todo-los correos lidos";
  }

    
    public String amosa (int k){
       if (msgs.get(k)==)
    }
    
    public void elimina (int k){
         msgs.remove(k);
    }
}
