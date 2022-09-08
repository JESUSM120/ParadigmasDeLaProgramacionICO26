package EjerciciosDeClase;

public class Principal {
    public static void main(String[] args) {
        Persona p1=new Persona("Diego",19,"M","Jiquipilco");
        Estudiante e1=new Estudiante("Jesus",19,"M","San Felipe",": 2124664","Paradigmas","8.5");
        Estudiante e2= new Estudiante();
        e1.mostrarinfo();
        p1.mostrarinfo();
    }
}
