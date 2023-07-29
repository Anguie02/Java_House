/*
 Hacer un programa que lea un número entero y muestre si el número es múltiplo
de 10
 */
package condicionales_ejercicio1;

import java.util.Scanner;


public class Condicionales_ejercicio1 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //Pedimos el ingreso del número entero
        System.out.println("Ingrese un número entero: ");
        //Lo almacenamos en una variable
        int dato, condicional;
        dato = entrada.nextInt();
        //Ahora lo verificamos si el número es múltiplo de 10
        // a es multiplo de b si b *c = a
        condicional = 10 % dato;
        if ( condicional == 0){
            System.out.println("El número es múltipo de 10");
        }//
        
        
        
        
    }
    
}
