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
public class GenName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Metodos obx = new Metodos();
       JOptionPane.showMessageDialog(null,"*****"+""+"AVISO"+""+"*****\n\nEste programa aún está en fase de desarrollo,\na la larga se irá mejorando.\n\nEspero que disfruteis él 'QuickScopernator' v0.1\n\n");
       JOptionPane.showMessageDialog(null,"Hola queridos suscriptores,\n\n"+" "+"-Este programa está hecho con la finalidad de entretener,\nespero que os lo paséis genial con él.\n\n"+"   "+"**QUE OS DIVIRTAIS**\n\n");
       
       
       int num;
       boolean y = true;
       do{  num = Integer.parseInt(JOptionPane.showInputDialog("***MENÚ*** QuickScopernator  v0.1\n\n Presiona la tecla '1' y 'Enter' para\n acceder al 'QuickScopernator'.\n\nPresiona la tecla '2' y 'Enter' para\nsalir del programa.\n\n"));
       if (num==1 || num==2){
       switch(num){
           case 1: JOptionPane.showMessageDialog(null,"i"+obx.s_nombre()+"ZzHD");
               break;
           case 2: JOptionPane.showMessageDialog(null,"***Hasta la vista ^_^***\n\n-Hecho por 'iwko',\ncon la colaboración de 'Puma Inc.'\n\nTwitter-->@iwkoYT\n\nYouTube-->iwko\n\nSuscribete :)\n\n");
            y = false;
       }
       
        
        
        
            }else JOptionPane.showMessageDialog(null,"*ERROR*\n\nPulse solo los números '1' y '2'");
        
    }while  (y==true);
}
}
    
