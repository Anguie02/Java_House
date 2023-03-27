/*SUMA DE NOTAS*/
package suma_de_notas;

import java.util.Scanner;
public class Suma_de_notas {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Creamos las variable 
        float nota1,nota2,nota3,suma;
        System.out.println("Ingrese la tres notas: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        suma = nota1 + nota2 + nota3;
        System.out.println("La suma de las tres notas es: "+ suma);
         
        
    }
    
}
