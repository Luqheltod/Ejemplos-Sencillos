
import java.util.Scanner;


/**
 *
 * @author Gsancho
 */
public class Bucles {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Ejercicio 1 
        int x, y;
        boolean par;
        System.out.println("Introduce dos numeros enteros");
        x = entrada.nextInt();
        y = entrada.nextInt();

        if (x % 2 == 0) {

            System.out.print("El primer numero es par y ");
        } else {

            System.out.print("El primer numero es impar y ");
        }

        if (y % 2 == 0) {
            System.out.print("el segundo es par");
        } else {
            System.out.print("el segundo es impar");
        }

        //Ejercicio 2 (comparacion continua)
        int cantidad;
        int numero;
        int numeroNuevo;
        System.out.println("\nCuantos numeros piensa usted introducir?");

        cantidad = entrada.nextInt();

        System.out.println("Introduzca el primer numero");
        numero = entrada.nextInt();

        for (int i = 1; i < cantidad; i++) {
            System.out.println("Introduzca mas numeros");
            numeroNuevo = entrada.nextInt();
            if (numeroNuevo <= numero) {
                System.out.println("El numero introducido es menor que el anterior");
            }
            numero = numeroNuevo;

        }

        //Ejercicio 3
        System.out.println("\nCuantos numeros piensa usted introducir?");

        cantidad = entrada.nextInt();
        int contador = 0;
        int numerosNegativos;
        for (int i = 0; i < cantidad; i++) {

            System.out.println("Introduzca sus numeros");
            numerosNegativos = entrada.nextInt();
            if (numerosNegativos < 0) {

                contador++;
            }

        }
        System.out.println("Usted introdujo : " + contador + " numeros negativos");

        int numeritos = 0;

        //Ejercicio 4
        while (numeritos != -7) {

            System.out.println("Introduzca numeros no mas: ");

            numeritos = entrada.nextInt();

        }

        //Ejercicio 5
        String usuario, usuario1, usuario2;
        String contrasenia, contrasenia1, contrasenia2;

        usuario1 = "admin";
        contrasenia1 = "";
        usuario2 = "german";
        contrasenia2 = "sanchez";

        do {
            System.out.println("Introduzca usuario y contraseña: (admin,admin)");

            usuario = entrada.next();
            contrasenia = entrada.next();

            if (usuario.equals("admin")) {

                contrasenia1 = "admin";
            }
            if (usuario.equals("german")) {

                contrasenia1 = "sanchez";

            }

        } while (!contrasenia.equals(contrasenia1));

        
        
        //Ejercicio 6. Decidir si un numero cualquiera es capicua
        
        
        System.out.println("Introduce un numero para determinar si es capicua: ");
        
        int numeroCapicua = entrada.nextInt();
        
        
       capicua(numeroCapicua); //El metodo se encuentra abajo.
        
        
        //ejercicio 7 ,decidir si es un numero primo
        System.out.println("Introducir un numero para ver si es primo");

        int primo = entrada.nextInt();

        int contador1 = 2;

        while (primo % contador1 != 0) {
            contador1++;
        }

        if ((contador1) == primo) {

            System.out.println("El numero es primo");

        } else {
            System.out.println("El numero no es primo");
        }

        //Ejercicio 8  , indicar la cantidad de numeros primos que hay hasta un numero.
        
        
        
        System.out.println("Introduce un numero para calcular la cantidad de numeros primos hasta el");
        
        
        int numPrim = entrada.nextInt();
        
        int contador3 ;
            
        
        for(int i =2;i<numPrim;i++){
            
            contador3=2;
            while(i%contador3!=0){
                
                contador3++;
            }
              if ((contador3) == i) {

            System.out.println(i);
    }
       
        }
        //Ejercicio 9 . Caracter a caracter
        for (int i = 0; i < 10; i++) {

            System.out.print("*");
        }

        //Ejercicio 10
        System.out.println(" ");
        for (int i = 2; i <= 10; i = i + 2) {

            System.out.print("*");

            if (i % 2 == 0) {
                System.out.print("+");
            }

        }

        System.out.println(" ");
        //Ejercicio11

        for (int i = 0; i < 12; i++) {
            
            if(i%3==0)
                System.out.print("*");
            
            if(i%3==1){
                System.out.print("+");
            }else{
                System.out.print("/");
}
            

                }
        
        //Ejercicio 12
        
        for(int i=0; i<5;i++){
            
            for(int j=0; j<=i;j++){
                
                System.out.print("*");
            }
            System.out.println(" ");
            
        }
        
        
        //Ejercicio 13
        
        for(int i = 1; i<=5; i++){
            
            for(int j = 1; j<=5-i; j++){
                System.out.print(" ");
            }
 
            
            for(int z=1; z<=(i*2)-1; z++){
                System.out.print("*");
            }
            System.out.println();
        }
            }
    
    
    public static void capicua(int numeroUno) {
		int invertido = 0;
		int resto = numeroUno;
		do {
			invertido = (invertido*10+resto%10);
			resto = resto/10;
		} while (resto/10 != 0 || resto%10 != 0); 
		if(numeroUno == invertido) {
			System.out.println("El numero es capicua");
		}else {
			System.out.println("El numero no es capicua");
		}
	}
        }