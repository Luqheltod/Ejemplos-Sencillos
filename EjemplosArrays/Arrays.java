
import java.util.Scanner;


/**
 *
 * @author Gsancho
 */
public class Arrays {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

//Ejercicio1
        int[] miArray = new int[5];

        miArray[0] = 1;
        miArray[1] = 2;
        miArray[2] = 3;
        miArray[3] = 4;
        miArray[4] = 5;

        System.out.println(miArray[0]);
        System.out.println(miArray[1]);
        System.out.println(miArray[2]);
        System.out.println(miArray[3]);
        System.out.println(miArray[4]);

//Ejercicio 2
        int[] miArray1 = new int[5];

        for (int i = 0; i <= 4; i++) {
            System.out.println("Escribe el primer numero que desee: " + (i + 1));
            miArray1[i] = entrada.nextInt();
            System.out.println("Has escrito: " + miArray1[i]);
        }

        //Ejercicio 3
        int[] miArray2 = new int[10];
        int total = 0;
        for (int i : miArray2) {

            miArray2[i] = (int) (Math.random() * 10);

            total += miArray2[i];

        }
        System.out.println("La media es: " + total / miArray2.length);

        //Ejercicio 4
        System.out.println("Indica el tamaño del Array");

        int tamanio = entrada.nextInt();

        System.out.println("Introduce el numero para introducir sus multiplos");

        int multiplo = entrada.nextInt();

        int[] miArray3 = new int[tamanio];

        int numeroElegido = multiplo;

        for (int i = 0; i < miArray3.length; i++) {

            miArray3[i] = numeroElegido;

            numeroElegido += multiplo;
        }

        for (int i = 0; i < miArray3.length; i++) {

            System.out.println(miArray3[i]);

        }

        //Ejercicio 5
        System.out.println("Indica el numero de nombres a introducir");

        int tamanio2 = entrada.nextInt();

        String[] losNombres = new String[tamanio2];
        int[] losTamanios = new int[tamanio2];

        for (int i = 0; i < losTamanios.length; i++) {
            System.out.println("Introduce el siguiente nombre");
            losNombres[i] = entrada.next();
            losTamanios[i] = losNombres[i].length();
        }

        System.out.println("Has introducido : ");

        for (int i = 0; i < losNombres.length; i++) {

            System.out.printf("Nombre: %s  Numero de letras: %d%n", losNombres[i], losTamanios[i]);

        }

        //Ejercicio 6
        System.out.println("Indique cuantas parejas de numeros quiere almacenar ");

        int parejas = entrada.nextInt();

        int[] arreglo1 = new int[parejas];
        int[] arreglo2 = new int[parejas];
        int[] arreglo3 = new int[parejas];

        System.out.println("Introduzca sus parejas");

        for (int i =0;i<arreglo1.length;i++) {

            System.out.println("Introduzca el numero:" + (1 + i));
            arreglo1[i] = entrada.nextInt();

            for (int j =0;j<arreglo2.length;j++) {

                if (i == j) {
                    System.out.println("y su pareja");
                    arreglo2[j] = entrada.nextInt();
                }
            }

        }

        for (int i = 0; i < arreglo3.length; i++) {
            
            arreglo3[i]= arreglo1[i] + arreglo2[i];

        }
        
        System.out.println("Usted introdujo finalmente: ");
        
        for (int i = 0; i < arreglo3.length; i++) {
            
            System.out.printf("Valor: %s ,   Valor: %s,    Es igual a: %s%n",arreglo1[i],arreglo2[i],arreglo3[i]);
            
        }
        
        
       // Ejercicio7 Crea un array con caracteres y busca en él un carácter pedido por teclado.
       
       char[] arrayCaracteres = new char[10];
       
       arrayCaracteres[0]= 'a';
       arrayCaracteres[1]= 'b';
       arrayCaracteres[2]= 'c';
       arrayCaracteres[3]= 'a';
       arrayCaracteres[4]= 'd';
       arrayCaracteres[5]= 'e';
       arrayCaracteres[6]= 'f';
       arrayCaracteres[7]= 'g';
       arrayCaracteres[8]= 'h';
       arrayCaracteres[9]= 'i';
       
        System.out.println("Introduce un caracter para buscar");
        
        char buscar = entrada.next().charAt(0);
        boolean busqueda = false;
        int posicion = 0;
        while(!busqueda && posicion<arrayCaracteres.length){
            
           
                
                if(arrayCaracteres[posicion]== buscar ){
                    
                    busqueda=true;
                }
                posicion++;
            }
        if(busqueda){
            
            System.out.println("El caracter se ha encontrado");
        }else{
            System.out.println("El caracter no se ha encontrado");
        }
        }
    }
