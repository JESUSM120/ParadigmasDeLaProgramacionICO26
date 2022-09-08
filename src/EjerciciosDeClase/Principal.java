package EjerciciosDeClase;

public class Principal {
    public static void main(String[] args) {
        Persona p1= new Persona("Maria",12,"Jocotitlan","F");
        Estudiante e1= new Estudiante("Juan", 17,"H","Atlacomulco","225748","Paradigmas de la programacion","8.2");

        Estudiante e2= new Estudiante();

        e1.mostrarInfo();
        System.out.println("...............................................");
        p1.mostrarInfo();
        System.out.println("-----------------------------------------------");
        e2.mostrarInfo();

    }
}
