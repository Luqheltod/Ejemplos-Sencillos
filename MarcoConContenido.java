
/* construimos una simple ventana con un texto encima */


package InterfacesDeUsuario;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Gsancho
 */
public class MarcoConContenido {
    
    public static void main(String[] args) {
        
        nuevoMarco ventana = new nuevoMarco();
        
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}


class nuevoMarco extends JFrame{ //creacion basica de marco (en otros archivos se explica este proceso)
    
    public nuevoMarco(){
        
        setVisible(true);
        
        setBounds (500,500,450,450);
        
        setTitle("Marco con texto ");
        
        Lamina milamina = new Lamina(); //creamos la lamina anterior
        
        add(milamina); //añadimos la lamina con el texto que hemos escrito abajho
    }
    
}

class Lamina extends JPanel{ //esta es la lamina que superpondremos en nuestra ventana
    
    
    @Override
    public void paintComponent( Graphics g){
        
        super.paintComponent(g); //llamamos al metodo padre para que ademas de lo nuestro, haga su trabajo. 
        
        g.drawString("El primer texto en ventana", 100, 100);
        
    }
    
}