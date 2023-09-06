
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
        
        //Al llamar al método nos retorna un valor
        //1.Debe ser almacenado para mostrarlo
        int resta = ope.resta(numero1, numero2);
        System.out.println("La resta es: "+ resta);
        
        //2.Lo mostramos directamente
        System.out.println("La suma es:"+ ope.sumar(numero1, numero2));
        
        
        
    
}
    
    
}
