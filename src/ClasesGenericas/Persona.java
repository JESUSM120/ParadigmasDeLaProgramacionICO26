package ClasesGenericas;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo ;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public Persona (String nombre, int edad, String sexo, String direccion){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.direccion=direccion;

    }
    public void mostrarinfo(){
        System.out.println("nombre: "+nombre);
        System.out.println("edad: "+edad);
        System.out.println("sexo: "+sexo);
        System.out.println("direccion: "+direccion);
    }
}
