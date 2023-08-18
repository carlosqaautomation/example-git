package polimorfismo;

public class Administrativo extends Persona {
    private String area;

    @Override
    public void Registrar(String nombreRegistrar) {
        System.out.println("Se sobreescribe el metodo registrar de la clase persona");
    }
}
