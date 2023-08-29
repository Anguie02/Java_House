
package clasesJava;

import java.util.Scanner;

// Clase base: Persona
class Persona {
    String nombre;
    String apellidos;
    String nacionalidad;

    Persona(String nombre, String apellidos, String nacionalidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
    }

    void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese los apellidos: ");
        apellidos = scanner.nextLine();

        System.out.print("Ingrese la nacionalidad: ");
        nacionalidad = scanner.nextLine();
    }

    void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Nacionalidad: " + nacionalidad);
    }
}

// Subclase: Student
class Student extends Persona {
    String carrera;
    int semestre;
    String curso;

    Student(String nombre, String apellidos, String nacionalidad, String carrera, int semestre, String curso) {
        super(nombre, apellidos, nacionalidad);
        this.carrera = carrera;
        this.semestre = semestre;
        this.curso = curso;
    }

    @Override//Comentario que indica que un método se esta sobreescribiendo
    void ingresarDatos() {
        super.ingresarDatos(); // Ingresar datos de Persona
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la carrera: ");
        carrera = scanner.nextLine();

        System.out.print("Ingrese el semestre: ");
        semestre = scanner.nextInt();
        scanner.nextLine(); // Consume la nueva línea pendiente

        System.out.print("Ingrese el curso: ");
        curso = scanner.nextLine();
    }
}

// Subclase: Profesor
class Profesor extends Persona {
    String especialidad;

    Profesor(String nombre, String apellidos, String nacionalidad, String especialidad) {
        super(nombre, apellidos, nacionalidad);
        this.especialidad = especialidad;
    }

    @Override
    void ingresarDatos() {
        super.ingresarDatos(); // Ingresar datos de Persona

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la especialidad: ");
        especialidad = scanner.nextLine();
    }
}

// Subclase de Student: StudentInternational
class StudentInternational extends Student {
    String pais;

    StudentInternational(String nombre, String apellidos, String nacionalidad, String carrera, int semestre, String curso, String pais) {
        super(nombre, apellidos, nacionalidad, carrera, semestre, curso);
        this.pais = pais;
    }

    @Override
    void ingresarDatos() {
        super.ingresarDatos(); // Ingresar datos de Student

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el país: ");
        pais = scanner.nextLine();
    }
    
    
    
    public static void main(String[] args) {
        // Ejemplo de uso
        StudentInternational studentInt = new StudentInternational("", "", "", "", 0, "", "");
        studentInt.ingresarDatos();

        System.out.println("\nDatos ingresados:");
        studentInt.mostrarDatos();
    }
    
    
}


