

public class Socio {
    int edad;
    String nombre;
    String poblacion;

    public Socio(int edad, String nombre, String poblacion) {
        this.edad = edad;
        this.nombre = nombre;
        this.poblacion = poblacion;
    }


    public Socio(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Socio "{" nombre = " + nombre + " edad = " + edad + + " población = " + poblacion + "}\n";
    }
}
