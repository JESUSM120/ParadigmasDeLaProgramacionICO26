package EjerciciosDeClase;

public interface IntAlumno2 {
    void mostrarGrado();
    int obtenerAñosdeCarrera();
    public abstract void entrarCurso();
    default void mostrarHorario(){
        System.out.println("Horario corrido");
    }
}
