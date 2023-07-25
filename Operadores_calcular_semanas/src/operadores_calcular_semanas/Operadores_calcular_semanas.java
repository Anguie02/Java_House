/*Contruir un programa que, dado un número total de horas, devuelve el número de 
semanas, días y horas equivalentes. Por ejemplo dado un total de 1000 horas debe
mostrar 5 semanas, 6 dias y 16 horas.

168 horas por semana
*/
package operadores_calcular_semanas;

import java.util.Scanner;

public class Operadores_calcular_semanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Priemero creamos el objeto
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos el ingreso del total de horas
        //Para ello primero definimos las variables para almacenar los datos 
        
        int total_h, semanas, dias ,horas, dias_resto;
        System.out.println("Ingrese el total de horas: ");
        total_h = entrada.nextInt();
        
        /*Ahora realizamos los cálculos
        En una semana hay 168h, entonces para calcular cuantas semanas hay en
        las horas totales vamos a dividirlo*/
        
        semanas = total_h / 168;
        
        //Calculamos los dias
        
        dias_resto = total_h % 168; //Almacenamos el resto 
        dias = dias_resto /  24 ;// Dividimos el resto entre 24 oras para saber cant.de dias
        
        //Calculamos las horas
        horas = dias_resto % 24; // El resto de la divición anteriro  serian las horas
        
        //Finalmente, mostramos
        System.out.println("En un total de "+ total_h + " horas. Hay "+ semanas+
                " semans, "+dias+" dias, "+horas+" horas.");
        
        
       
        
    }
    
}
