package EjerciciosDeClase;

public class Persona {
    String Nombre;
    int Edad;
    String Sexo;
    String Direccion;

    public Persona(String nombre, int edad, String sexo, String Direccion) {
        this.Nombre = nombre;
        this.Edad = edad;
        this.Sexo = sexo;
        this. Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+ Nombre);
        System.out.println("Edad: "+Edad);
        System.out.println("Sexo: "+Sexo);
        System.out.println("Direcion: "+Direccion);
    }
}
