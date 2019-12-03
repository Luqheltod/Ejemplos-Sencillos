
import java.util.Scanner;


/**
 *
 * @author Gsancho
 */
public class Condicionales {
    
    public static void main(String[] args) {
        
       //1  Pedir dos números y decir si son iguales o no.
        
       
       int x,y,z;
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("Introduce el primer digito");
        
        x = entrada.nextInt();
       
        System.out.println("Introduce el segundo digito");
        
        y = entrada.nextInt();
        
        if(x==y){
            
            System.out.println("Los dos numeros son iguales");
        }
        
        else {
            System.out.println("Los dos numeros no son iguales");
            
        }
            
       
    
    
    
//2 dos numeros y si es multiplo

        System.out.println("Introduce el primer digito");
        
        x = entrada.nextInt();
       
        System.out.println("Introduce el segundo digito");
        
        y = entrada.nextInt();

       if(x%y==0){
           System.out.println("El primer número es multiplo del segundo");
       }else if(y%x==0){
           System.out.println("El segundo número es múltiplo del primero");
          }else{
                System.out.println("Ninguno de los dos es múltiplo ");
            }
       
       
       //3 pedir un numero y decir si es positivo o negativo
        System.out.println("Inserte un número");
        x = entrada.nextInt();
       
      String resultado = (x>=0)?"positivo":"negativo";
            System.out.println(resultado);
      
            
            
            //4 Pedir tres números y decir cuál es el mayor y cuál es menor o si son iguales
            
            int n3;
        System.out.println("Inserte un número");
        x = entrada.nextInt();
        System.out.println("Inserte el segundo número");
        y = entrada.nextInt();
        System.out.println("Inserte el tercer numero");
        z = entrada.nextInt();
       
        if(x==y && y==z){
           System.out.println("Los tres numeros son iguales");
        }else{
            int grande, chico;
            if(x>y && x>z){
                grande = x;
            }else{
                if(y>x && y>z){
                    grande = y;
                }else{
                    grande = z;
                }
            }
            
            if(x<y && x<z){
               chico = x;
            }else{
                if(y<x && y<z){
                    chico = y;
                }else{
                    chico = z;
                }
            }
            System.out.println("Mayor: "+grande+" Menor: "+chico);
        }
        
        //Ejercicio 5:  Pedir un número entre 0 y 9.999, decir si es capicúa.
        System.out.println("Inserte un número");
       int n1 = entrada.nextInt();
        if(n1<0 || n1>9999){
            System.out.println("Número no válido");
        }else{
            if(n1<10){
                System.out.println("Es capicúa");
            }else{
                if(n1<100){
                    if(((n1%10)*10+(n1/10))==n1){
                        System.out.println("Es capicúa");
                    }else{
                        System.out.println("No es capicúa");
                    }
                }else{
                    if(n1<1000){
                        if(((n1%10)*100+((n1/10)%10)*10+((n1/10)/10))==n1){
                            System.out.println("Es capicúa");
                        }else{
                            System.out.println("No es capicúa");
                        }
                    }else{
                        if(((n1%10)*1000+((n1/10)%10)*100+(((n1/10)/10)%10)*10+(((n1/10)/10)/10))==n1){
                            System.out.println("Es capicúa");
                        }else{
                            System.out.println("No es capicúa");
                        }
                    }
                }
            }
        
        }
        
        
        
        //6 Salarios
        
        System.out.println("Introduce el salario:"); 
        
        int salario = entrada.nextInt();
        int salario2 = 0;
        double salarioFinal=0;
        if (salario<9000){
            salario2=1;
        } else if (salario >9000){
            
            salario2=2;
        }else if (salario >15000){
            
            salario2=3;
        }else{
            salario2=4;
        }
        
        
        switch (salario2){
            
            case 1 : 
                
                salarioFinal = salario*1.2;
                break;
            case 2 : 
                
                salarioFinal = salario*1.1;
                break;
            case 3 : 
                
                salarioFinal = salario*1.05;
                break;
            case 4 : 
                
                salarioFinal = salario*1.03;
                break;
            
          
            
        }
              System.out.println("Su salario final sera: " +salarioFinal);
         
        
        //7 codigos promocionales 
        
        String codigo;
        int factura;
        int valor = 0;
        System.out.println("Introduce el importe de tu factura");
        
        factura = entrada.nextInt();
        
        System.out.println("Introduce el codigo promocional");
        
        
        codigo = entrada.next();
       
        
        if(codigo.equalsIgnoreCase("plusoro")){
            
            valor =1;
        } if(codigo.equalsIgnoreCase("platino33")){
            
            valor =2;
        }if(codigo.equalsIgnoreCase("100max")){
            
            valor = 3;
        }if(codigo.equalsIgnoreCase("supersilver")){
            valor= 4;
            
        } if(codigo.equalsIgnoreCase("totalbronce"))
                
           valor = 5;
                
        
        
        
        switch(valor){
            
            case 1: factura-=25; 
            
                System.out.println("Codigo valido, tu factura es: " +factura);
                break;
            case 2: factura-=20;
                System.out.println("Codigo valido, tu factura es: " +factura);
                break;
            case 3: factura-=15;
                System.out.println("Codigo valido, tu factura es: " +factura);
                break;
            case 4: factura-=10;
                System.out.println("Codigo valido, tu factura es: " +factura);
                break;
            case 5: factura-=5;
                System.out.println("Codigo valido, tu factura es: " +factura);
                break;
            default : System.out.println("Codigo invalido");
            
            
        }
        
       
        
 
        
        
    }
}
        
