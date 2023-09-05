
package Clases;

import java.util.Scanner;


public class Main {
    public static void main(String[] arg){
        
        //Creamos un objeto Scanner para pedir los números
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos el ingreso de números y los almacenamos
        System.out.println("Ingrese el primer número: ");
        int numero1= entrada.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = entrada.nextInt();
        
        Operaciones ope = new Operaciones();//Creamoes el objeto
        ope.resta(numero1, numero2); //Pasamos los números ingresados como argumentos
        ope.mostrar();
    
}
    
    
}
