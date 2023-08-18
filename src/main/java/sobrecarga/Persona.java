package sobrecarga;

public class Persona {
    public void Registrar(){
        System.out.println("Registrar sin parametros");

    }

    public void Registrar(String dato1){
        System.out.println("Registrar con 1 parametro: "+dato1);

    }

    public void Registrar(String dato1,String dato2){
        System.out.println("Registrar con 2 parametros: "+dato1 + " "+dato2);
    }
}
