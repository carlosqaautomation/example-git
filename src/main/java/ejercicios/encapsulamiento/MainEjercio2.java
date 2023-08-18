package ejercicios.encapsulamiento;

import java.util.Scanner;

public class MainEjercio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = scan.next();
        Alumno alumno = new Alumno(nombre);
        //System.out.println(alumno.getCalificaciones());
        System.out.println("Ingrese calificaciones");
        for (int i = 0; i < alumno.getCalificaciones() ; i++) {
            int calificacion = scan.nextInt();
            alumno.ingresarCalificacion(i,calificacion);
        }
        System.out.println("El promedio del alumno "+alumno.getNombre()+" es: "+alumno.calcularPromedio());

    }
}
