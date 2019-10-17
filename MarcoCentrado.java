/*creamos un marco centrado con una pequeña imagen propia como icono.  */



package InterfacesDeUsuario;

//importamos las librerias que necesitamos
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Gsancho
 */
public class MarcoCentrado {
    
    public static void main(String[] args) {
        
        MarcoCentro ventana = new MarcoCentro(); //aqui creamos nuestro objeto ventana, la clase la tenemos abajo, que hereda de JFrame, con sus correspondientes metodos
        
        ventana.setVisible(true); //simplemente para hacerla visible, ya que las ventanas por defecto son siempre invisibles. 
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //el comportamiento del programa al cerrar la ventana, en este caso se termina. 
    }
    
    
    
}


class MarcoCentro extends JFrame{
    
    public MarcoCentro(){
        
        
        
      Toolkit mipantalla =  Toolkit.getDefaultToolkit(); //con esto vamos a coger los recursos/parametros de la maquina en la que estamos.
      
     Dimension tamanioPantalla= mipantalla.getScreenSize(); //el metodo getScreensize devuelve un objeto del tipo Dimension, por ello lo creamos(todo esto puede verse en la API)
     
        int alturaPantalla = tamanioPantalla.height; //los atributos de Dimension son height y width. 
        
        int anchoPantalla = tamanioPantalla.width;
      
        setBounds(anchoPantalla/4, alturaPantalla/4,anchoPantalla/2,alturaPantalla/2); // los usamos para definir el tamaño con el metodo setBounds, que JFRAME hereda de Class Window
     
        setTitle("Marco Centrado");
        
        Image miIcono = mipantalla.getImage("src/Graficos/icono.gif"); //getImage devuelve un Image, lo creamos y le damos como atributo la ruta.
        
        setIconImage(miIcono); // con esto simplemente lo usamos para nuestra ventana. 
    }
    
    
    
}