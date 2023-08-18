package sobrecarga;

public class EjercicioSobrecarga {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.Registrar();
        persona1.Registrar("dato-1");
        persona1.Registrar("dato-1","dato-2");
    }
}
