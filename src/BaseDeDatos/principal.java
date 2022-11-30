package BaseDeDatos;
import java.sql.Connection;
public class principal {
    public static void main(String[] args) {
        conexion con = new conexion();

        //con.obtenerConexion();
        con.insertarLibro();
    }
}
