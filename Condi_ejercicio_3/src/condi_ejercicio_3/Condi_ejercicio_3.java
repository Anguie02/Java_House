/*
 Un obrero necesita calcular su salario semanal, el cual obtiene de la siguiente manera:
-Si trabaja 40 horas o menos se le paga $16 por hora
-Si trabaja más de 40 hora se le paga $16 por cada una de las primera 40 horas y
$20 por cada hora extra.
 */
package condi_ejercicio_3;

import java.util.Scanner;


public class Condi_ejercicio_3 {

    
    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        //Definir las variables
        int horas_totales, primeras_horas, horas_extras;
        float salario_semanal;
        
        //Pedir la cantidad de horas totales trabajadas a la semana
        System.out.println("Ingrese la cantidad de horas trabajada a la semana: ");
        horas_totales = entrada.nextInt();//Guardamos el dato
        
        //Realizamos los calculos
        if( horas_totales <= 40){
            salario_semanal = 16 * horas_totales;
            System.out.println("Tu salario semanal es :" + salario_semanal);
        }
        
        else{
            horas_extras = horas_totales - 40;//horas extras
            //Calculamos el monto por las primeras 40 horas trabajadas
            primeras_horas = 16 * 40;
            //Calculamos el monto por las horas extras
            horas_extras *= 20 ;
            // Salario semanal
            salario_semanal = primeras_horas + horas_extras;
            
            System.out.println("Tu salario semanal es :"+ salario_semanal);
        }
        
        
        
    
    
        
    }//fin
    
}//fin
