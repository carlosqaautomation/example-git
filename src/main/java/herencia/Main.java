package herencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombres = scan.next();
        System.out.println("Ingrese el apellidos");
        String apellidos = scan.next();
        System.out.println("Ingrese el documento");
        String documento = scan.next();
        System.out.println("Ingrese dias trabajados");
        int diasTra = scan.nextInt();
        System.out.println("Ingrese el sueldo");
        float sueldo = scan.nextFloat();

        Empleado empleado1 = new Empleado();
        empleado1.setNombres(nombres);
        empleado1.setApellidos(apellidos);
        empleado1.setDocumento(documento);
        empleado1.setDiasTrabajados(diasTra);
        empleado1.setSueldo(sueldo);

        System.out.println("El empleado "+ empleado1.getNombres() + " "+ empleado1.getApellidos() + " con documento " + empleado1.getDocumento()+ " tiene un sueldo de "+ empleado1.calcularSueldo());


    }
}
