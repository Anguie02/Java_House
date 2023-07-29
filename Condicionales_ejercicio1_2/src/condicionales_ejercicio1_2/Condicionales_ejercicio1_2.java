/*
 Pedir dos números y decir cúal es el mayor o sin son iguales.
 */
package condicionales_ejercicio1_2;

import java.util.Scanner;

public class Condicionales_ejercicio1_2 {

    
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        //Primero declaramos las variables
        int numero1, numero2;
        //Pesimos el ingreso de datos
        System.out.println("Ingrese el primer número entero: ");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo número entero: ");
        numero2 = entrada.nextInt();
        
        //Proceso: comparamos los números
        if(numero1 > numero2){
            System.out.println("El número "+numero1+ "es mayor que "+numero2);
        } 
        else if(numero1 == numero2){
            System.out.println("Los números son iguales");
        
        }
        else{
            System.out.println("El número "+numero2+"es mayor");
        }
        
        
        
    }//final
    
}//final
