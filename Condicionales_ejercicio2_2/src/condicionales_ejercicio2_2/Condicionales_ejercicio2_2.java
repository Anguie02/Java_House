/*
 En MegaPlaza se  hace un 30% de descuento a los clientes cuya compra supere los 
300 soles. ¿Cuál será la cantidad que pagará una persona por su compra?
 */
package condicionales_ejercicio2_2;

import java.util.Scanner;

public class Condicionales_ejercicio2_2 {

   
    public static void main(String[] args) {
        //Creamos un objeto de la clase Scanner
        Scanner entrada = new Scanner(System.in);
        //Definimos una variable
        float monto, descuento;
        //Pedimos que se ingrese la cantidad total de la compra
        System.out.println("Ingrese el monto total de la compra: ");
        //Almacenamos el monto
        monto = entrada.nextFloat();
        //Comprobamos el monto para realizar el descuento
        if(monto > 300){
            descuento= 0.30f * monto  ;
            monto -= descuento;
            System.out.println("Se aplicará el descuento del 30%");
            System.out.println("\nEl total a pagar es : "+monto);
        }else{
            System.out.println("No se aplicará el descuento");
        }
        
    }//fin
    
}//fin
