//Un pequeño temporizador donde se pueden observar clases internas y algunas utilidades de la API de java.
//Ejercicio extraido de un video de youtube de pildorasInformaticas
package Basico;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;
/**
 *
 * @author Gsancho
 */
public class TemporizadorClaseInterna {
    
    
    public static void main(String[] args) {
        
        Reloj miReloj = new Reloj(3000, true);
        
        miReloj.enMarcha();
        
        JOptionPane.showMessageDialog(null, "Para parar pulse Aceptar");
     
        System.exit(0);
    }
    
}

class Reloj{
    
    private int intervalo;
    private boolean sonido;
    
    public Reloj(int intervalo, boolean sonido){
        
        this.intervalo = intervalo;
        this.sonido = sonido;
    }
    
    public void enMarcha(){
        
        ActionListener oyente = new DameLaHora2();
        
        Timer mitemporizador = new Timer(intervalo , oyente);
        
        mitemporizador.start();
    }
    
    private class DameLaHora2 implements ActionListener{
        
        public void actionPerformed(ActionEvent evento){
            
            Date ahora = new Date();
            
            System.out.println("Pongo hora cada 3sg" + ahora);
            
            if(sonido){
                
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
    
}