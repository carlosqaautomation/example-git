package org.example;

import java.util.Scanner;

public class Main_POO {
    public static void main(String[] args) {
        //Declarando
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre del perro");

        String nombrePerro = scan.nextLine();
        //Inicializando la clase
        Perro fido = new Perro(nombrePerro);
        fido.setEdad(5);
        fido.setNumeroPatas(4);
        fido.setColor("negro");
        fido.setRaza("pitbull");
        fido.setVacunado(true);

        fido.comer("rikocan");
        fido.correr();
        fido.ladrar();
        fido.informacion();
    }
}
