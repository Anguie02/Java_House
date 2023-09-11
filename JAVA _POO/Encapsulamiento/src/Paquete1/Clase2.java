
package Paquete1;

public class Clase2 {
    public static void main(String[] args){
        Clase1 persona = new Clase1();
    
        //Accdemos a los atributos con los métodos accesores
        persona.setEdad(21);
        System.out.println("Tu edad es: "+ persona.getEdad());
        
    }
    
}
