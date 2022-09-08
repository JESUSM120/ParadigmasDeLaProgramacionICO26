package EjerciciosDeClase;

public class Estudiante extends Persona implements IntAlumno1, IntAlumno2 {
    private String noCuenta;
    private String Curso;
    private String calificacion;
    public Estudiante(String Nombre, int Edad, String Sexo, String Direccion, String noCuenta,String Curso,
                      String calificacion){
        super(Nombre,Edad, Sexo, Direccion);
        this.noCuenta= noCuenta;
        this.Curso = Curso;
        this.calificacion =calificacion;
    }

    public Estudiante() {
        super("Jesus",19,"H","Libramiento Francisco villa");
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public String getCurso() {
        return Curso;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void verCalificacion(){
        System.out.println("La calificacion de: "+getNombre()+" Es de: "+calificacion);
    }


    public void verCurso(){
        System.out.println("EL curso es: "+Curso);
    }
@Override
    public void mostrarInfo(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Sexo: "+getSexo());
        System.out.println("Direccion: "+getDireccion());
        System.out.println("Numero de cuenta: "+noCuenta);
        System.out.println("Curso: "+Curso);

    }
    @Override
    public void mostrarCurso(){
        System.out.println("Curso: ");
    }

    @Override
    public void mostrarGrado() {

    }

    @Override
    public int obtenerAñosdeCarrera() {
        return 0;
    }

    @Override
    public void entrarCurso() {

    }
}
