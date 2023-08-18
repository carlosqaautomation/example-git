package ejercicios.encapsulamiento;

public class Alumno {
    //Atributos
    public String nombre;
    public double[] calificaciones = new double[5];

    //Contructor
    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    //Metodos get
    public int getCalificaciones() {
        return calificaciones.length;
    }

    public String getNombre() {
        return nombre;
    }

    //Metodos
    public void ingresarCalificacion(int index,int calificacion){
        calificaciones[index] = calificacion;
        System.out.println("la calificacion es:"+ index +"-" +calificaciones[index]);
    }

    public double calcularPromedio(){
        double promedio;
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
             suma = suma + calificaciones[i];
        }
        promedio = suma/calificaciones.length;
        return promedio;
    }
}
