
package OrdenArrayObjetos;

/**
 *
 * @author Gsancho
 */
public class Bolas implements Comparable{
    
    
    private int numero;
    
    private double peso;
    
    public Bolas(int numero, double peso){
        
        this.numero = numero;
        
        this.peso = peso;
    }

    public int getNumero() { //getter
        return numero;
    }

    public double getPeso() { //getter
        return peso;
    }
    
    
    @Override
    public int compareTo(Object o){  //sobreescribimos el metodo compareTo , siempre ha de devolver -1 si es menor, 1 si es mayor y 0 si es igual. En este caso comparamos el valor peso.
      
        Bolas otraBola =(Bolas) o;
        
       if(this.peso<otraBola.peso){
           
           return -1;
       } 
       if(this.peso>otraBola.peso){
           
           return 1;
       } 
        
        return 0;
    }
    
}
