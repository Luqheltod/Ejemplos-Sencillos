
package OrdenArrayObjetos;

import java.text.DecimalFormat; //decimalformat nos sirve en este caso para formatear numeros 
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author Gsancho
 */
public class mainBolas {
    
    
    public static void main(String[] args) {
        
        
        DecimalFormat formato1 = new DecimalFormat("#.00"); //elegimos como queremos que se representen para usarlo despues al mostrar en pantalla.
        
        Bolas bolas[] = new Bolas[10];
        
        for (int i = 0; i <10; i++ ){
            
            bolas[i] = new Bolas(i,Math.random()*100); //el peso de las bolas va a ser aleatorio 
            
            
            
        }
        
       String[] elecciones = {  // un array de strings que contendra nuestras opciones del siguiente joptionpane, donde seleccionaremos la opcion
            "Ordenadas por peso",
            "Ordenadas por numero"
            
};
int eleccion = JOptionPane.showOptionDialog(null, "Elija como quiere que se le muestre la informacion", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, elecciones, elecciones[0]);
        
if (eleccion == 0){    //si elejimos ordenar, ejecuta la instruccion, si no lo mostrara por orden de numero. 
        Arrays.sort(bolas);
}


        for (Bolas bola : bolas) {
            
            System.out.println("Bola numero: "  + (bola.getNumero()+1) + " Peso: " +   formato1.format(bola.getPeso()) + " Kg" );
            
        }
        
       
        
        
    }
}
