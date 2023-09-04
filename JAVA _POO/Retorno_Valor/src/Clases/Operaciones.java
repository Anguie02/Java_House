
package Clases;

import java.util.Scanner;


public class Operaciones {
    //Atributos
   int numero1;
   int numero2;
   int sumar;
   int resta;
   
   //Métodos
   public void sumar(){
       Scanner entrada = new Scanner(System.in);
       System.out.println("Ingrese el primer número: ");
       numero1 = entrada.nextInt();
       System.out.println("Ingrese el segundo número: ");
       numero2 = entrada.nextInt();
       
       sumar = numero1 + numero2;   
   }
   
   public void resta(){
       resta = numero1 + numero2;
       
   }
   
   public void mostrar(){
       System.out.println("La suma es: "+ sumar);
   }
   
    
}
