package polimorfismo;

public class Main {
    public static void main(String[] args) {
        //Instanciar las clases
        Persona persona1 = new Persona();
        Administrativo persona2 = new Administrativo();
        Docente persona3 = new Docente();

        persona1.Registrar("Carlos");
        persona2.Registrar("Jose");
        persona3.Registrar("David");

    }
}
