package EjerciciosDeClase;

public interface IntAlumno2 {
    void MostrarGrado();
    int obtenerAñosCarrera();
    public abstract void EntrarCurso();
    default void MostrarHorario(){
        System.out.println("Horario corrido");
    }
}
