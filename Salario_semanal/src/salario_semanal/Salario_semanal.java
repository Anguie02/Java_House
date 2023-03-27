/**Hacer un programa que calcule e imprama el salario semanal de un empleado 
a partir de sus horar semanales trabajadas y de su salario por hora*/
package salario_semanal;

import  java.util.Scanner;

public class Salario_semanal {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       //Cuantas horas al dia se realiza el trabajo
       int horas_dia, dias_laborables;
       //Salariio por hora
       float salario_hora, salario_dia, salario_semanal;
       //Pedimos el ingreso de datos
       //Dias laborables a la semana
        System.out.println("Cuántos días a la semana trabaja?: ");
        dias_laborables = entrada.nextInt();
       //Horas al día trabajadas
        System.out.println("¿Cuántas horas al día trabaja?: ");
        horas_dia = entrada.nextInt();
        //Salario por hora
        System.out.println("¿Cuál es su salario por hora?: ");
        salario_hora = entrada.nextFloat();
        //Calculamos el salario por dia
         salario_dia = horas_dia * salario_hora;
        //Calculamos el salario semanal
        salario_semanal = salario_dia * dias_laborables;
        //Mostramos el salario semanal
        System.out.println("Su salario semanal es : "+ salario_semanal);
       
       
    }
    
}
