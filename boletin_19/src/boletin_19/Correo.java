/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_19;

import javax.swing.JOptionPane;

/**
 *
 * @author plago-bergonpazos
 */
public class Correo {

    String correo;
    boolean x ;

    

    public Correo() {
       
        this.correo = JOptionPane.showInputDialog("Introduce el correo");
        this.x = true;//Non lido
    }
    
    
    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isX() {
        return x;
    }

    public void setX(boolean x) {
        this.x = x;
    }

}
