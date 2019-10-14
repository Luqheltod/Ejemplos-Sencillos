

import java.util.*;
/**
 *
 * @author Gsancho
 */


// los tipos enumerados sirven para almacenar valores definidos y limitados.
//es una variable objeto de tipo enum.
//han de declararse fuera del metodo main.

public class tiposEnumerados {
    
     // Podria hacerse esto , dar un valor a una variable de tipo Tamaño, que es un tipo enumerado    

    /* enum Tamaño {diminuto, pequeño, mediano, grande, enorme }
    
       
        Tamaño d = Tamaño.diminuto;
                
        Tamaño p = Tamaño.pequeño;        
        
        Tamaño m = Tamaño.mediano;
        
        Tamaño g = Tamaño.grande;
        
        Tamaño xxl = Tamaño.enorme;
        
        */  
    
      // o podriamos hacer esto,  
    
    enum Tamaño {
        
    
        
        Diminuto("D"),Pequenio("P"),Mediano("M"),Grande("G"),Enorme("XXL"); //es importante declarar esto lo primero
        
        private String letra;
        
        private Tamaño(String letra){ //este constructor siempre ha de ir en privado
            
            this.letra= letra;
        }
        
        public String dameLetra(){
            
            return letra;
        }
        
        //  return  Character.toUpperCase(str.charAt(0)) + str.substring(1, str.length()).toLowerCase();
    }
    
    public static String Mayus(String mayus) {  // un pequeño metodo para convertir la primera letra en mayuscula. 
  if (mayus == null || mayus.isEmpty()) {  // primero determinamos si es null o esta vacio.
    return "";            
  } else { //despues devolvemos un string que es la suma de la primera letra en mayuscula mas el resto en minuscula con los propios metodos de String
    return  Character.toUpperCase(mayus.charAt(0)) + mayus.substring(1, mayus.length()).toLowerCase();
  }
}
    
    public static void main(String[] args) {
        
   Scanner entrada = new Scanner (System.in);
   
        System.out.println("Escribe un tamaño: diminuto, pequenio, mediano, grande, enorme");
        
        String entrada_usuario = Mayus(entrada.next());
        
        Tamaño el_tamaño = Enum.valueOf(Tamaño.class, entrada_usuario); //almacenamos en el tamaño lo que el usuario nos pasa. El metodo Value of de ENUM, devuelve el nombre , y se le pasa
                                                                        // el tipo enum y un valor a buscar como argumentos, en este caso lo que el usuario ha introducido
        // imprimimos lo que el usuario ha introducido y su abreviatura
        //correspondiente con el metodo que definimos anteriormente en el propio enum
        
        System.out.println("Tamaño:" +el_tamaño);
        System.out.println("Abreviatura=" + el_tamaño.dameLetra());
    }
    
}
