/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesDeUsuario;
import java.awt.Frame;
import javax.swing.*;
/**
 *
 * @author Gsancho
 */
public class CreandoMarcos {
    
    public static void main(String[] args) {
        
        miMarco frame1 = new miMarco();
        
        frame1.setVisible(true);
       
        
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class miMarco extends JFrame{
    
    public miMarco(){
        
       // setSize(500,300);   metodo para el tamaño
       // setLocation(500,300); metodo para la localizacion
       
       setBounds(500,300,250,250);  // metodo que incorpora ambos metodos de arriba
       
     //  setResizable(false);  //la ventana no se podra alargar o empequeñecer.
       
      // setExtendedState(JFrame.MAXIMIZED_BOTH); //pantalla completa. 
      
      setTitle("Ventana creada");
    }
}