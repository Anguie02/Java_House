/*La calificación final de un estudiante de informática se calcula 
con base a las calificasiones de cuatro aspectos de su rendimiento académico:
participación, primer examen parcial, segundo examen parcial y examen final. 
Sabiendo que las calificaciones anteriores entran a la calificacíon final
con ponderaciones del 10%, 25%, 25% y 40%*. Hacer un programa que calcule e 
imprima la calificación final obtenida por un estudiante. */
package operadores_calificación;

import java.util.Scanner;

public class Operadores_calificación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        //Declaramos las variables
        
        float participacion,primer_exa, segundo_exa,examen_final,calificacion_final;
        //Datos de entrada
        //Pedimos las notas de los cuatro aspectos
        
        System.out.println("Ingrese la nota de participación: " );
        participacion = entrada.nextFloat();
        System.out.println("Ingrese la nota del primer examen parcial: ");
        primer_exa = entrada.nextFloat();
        System.out.println("Ingrese la nota del segundo examen parcial:");
        segundo_exa = entrada.nextFloat();
        System.out.println("Ingrese la nota del examen final: ");
        examen_final = entrada.nextFloat();
        //Proceso
        //10% de la participación, 25% del primer examen, 25% del segundo examen
        // 40% del examen final
        
         participacion *= 0.10f;
         primer_exa *=  0.25f;
         segundo_exa *= 0.25f;
         examen_final *= 0.40f;
       //calculamos la calificacion final
       
         calificacion_final = participacion + primer_exa + segundo_exa + examen_final;
         //Mostramos la calificación
         
         System.out.println("La calificación final es " + calificacion_final);
         
        
       
       
         
         
        
        
    }
    
}
