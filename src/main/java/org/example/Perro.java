package org.example;

//Clases
public class Perro {

    //Atributos
    public String nombre;
    int edad;
    String raza;
    String color;
    boolean vacunado;
    public int numeroPatas;

    //Constructor
    public Perro(String nombre){
        this.nombre = nombre;
    }

    //Metodos
    public void ladrar(){
        System.out.println(nombre + " esta ladrando");
    }

    public void comer(String alimento){
        System.out.println(nombre + " esta comiendo " + alimento);
    }

    public void correr(){
        System.out.println(nombre + " esta corriendo");
    }

    public void informacion(){
        System.out.println(nombre+" tiene "+edad+" años, es de raza "+raza+" y color "+color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
