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
public class Boletin_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
       Buzon obx = new Buzon();
       
       boolean x = true;
       
       /** int x = obx.numeroDeCorreos();
        System.out.println(x);
        
        boolean y = obx.porLer();
        System.out.println(x);
        
        String j = obx.AmosaPrimerNoLeido();
        System.out.println(j);
        
        String k = obx.amosa(1);
        System.out.println(k);
        
        obx.elimina(0);**/
        while(x == true){
           
        switch(Integer.parseInt(JOptionPane.showInputDialog("***PROGRAMA CORREO***\n\n1º) Añadir correo\n2º) Ver número de correos en la bandeja\n3º) Ver si hay correos por leer\n4º) Ver el primer correo no leido\n5º) Ver el correo deseado\n6º) Eliminar correo\n7º) Salir"))){
              
            case 1:
                Correo obx1 = new Correo();
                obx.engade(obx1);
                break;
            case 2:
               JOptionPane.showMessageDialog(null, "El número total de correos en la bandeja es "+obx.numeroDeCorreos());
                break;
            case 3:
                if(obx.porLer()==true){
                    JOptionPane.showMessageDialog(null, "Quedan por leer correo/os");
                    }else JOptionPane.showMessageDialog(null, "No quedan por leer ningún correo");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,obx.AmosaPrimerNoLeido());
                break;
            case 5:
                  JOptionPane.showMessageDialog(null,obx.amosa(Integer.parseInt(JOptionPane.showInputDialog("¿Que correo deseas ver?"))));
                break;
            case 6:
               obx.elimina(Integer.parseInt(JOptionPane.showInputDialog("¿Qué correo quieres eliminar?")));
                break;
            case 7:
                x = false;
                break;
            default:
                break;
        }    
        }
            
        
    }
    
}
