
package condicional_múltiple_switch;
import java.util.Scanner;

public class Condicional_múltiple_SWITCH {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 5");
        int dato  =  entrada.nextInt();
        //***********************
        switch(dato){
            case 1 : System.out.println("El número es 1"); 
            break;
            case 2 : System.out.println("El número es 2");
            break;
            case 3 : System.out.println("El número es 3");
            break;
            case 4 : System.out.println("El número es 4");
            break;
            case 5 : System.out.println("El número es 5");
            break;
            default :
            System.out.println("El número no esta dentro del rango");
        
        
        }
        
        
        
        
        
        
        
        
    }
    
}
