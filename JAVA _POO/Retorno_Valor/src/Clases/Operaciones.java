
package Clases;

import java.util.Scanner;


public class Operaciones {
    //Atributos
  
   int sumar;
   int resta;
   
   //Métodos
   public void sumar(int numero1, int numero2){
       
       
       sumar = numero1 + numero2;   
   }
   
   public void resta(int numero1, int numero2){
       resta = numero1 - numero2;
       
   }
   
   public void mostrar(){
       System.out.println("La resta es: "+ resta);
   }
   
    
}
