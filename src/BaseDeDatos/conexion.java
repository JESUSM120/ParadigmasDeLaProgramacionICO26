package BaseDeDatos;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class conexion {
    Connection conexion = null;
    String usuario = "Jesus";
    String contrasena = "1234";
    String db = "lIBROS";
    String puerto = "1433";

    public Connection obtenerConexion() {
        try {
            String cadena = "jdbc:sqlserver://DESKTOP-SH31L6B: " + puerto + ";" + "databaseName=" + db;
            conexion = DriverManager.getConnection(cadena, usuario, contrasena);
            JOptionPane.showMessageDialog(null,"Conexion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion no exitosa"+e.toString());
        }
        return conexion;

    }
    public PreparedStatement insertarLibro(){
        conexion op = new conexion();
        Connection cn = null;
        PreparedStatement ps = null;
        try {
            cn= op.obtenerConexion();
            String ID = JOptionPane.showInputDialog("Intrudusca su ID:");
            String NOMBRE = JOptionPane.showInputDialog("Introdusca el nombre del libro");
            String EDITORIAL = JOptionPane.showInputDialog("Introdusca el editorial");
            String PRECIO = JOptionPane.showInputDialog("Intrudusca el precio del libro");
            String query = "INSERT INTO lIBROS VALUES (?,?,?,?)";
            ps = cn.prepareStatement(query);
            ps.setString(1, ID);
            ps.setString(2, NOMBRE);
            ps.setString(3, EDITORIAL);
            ps.setString(4, PRECIO);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Libro creado exitosa");
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
        return ps;
    }
}