/*
 Hacer un programa que lear  un caracter por teclado y compruebe si  es una letra
mayúscula.
 */
package condicionales_ejercicio_2;

import java.util.Scanner;


public class Condicionales_ejercicio_2 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //Definimos una variable y pedimos el ingreso del dato
        char letra;
        System.out.println("Ingrese una letra: ");
        //Leer un dato de tipo "char" desde el teclado
        letra = entrada.next().charAt(0);
        //Verificamos 
        if(Character.isUpperCase(letra)){ // el método devuelve un boleano
            System.out.println("La letra es mayúscula");  
        }else{
            System.out.println("La letra es minúscula");
        }
        
    }//
    
}//
