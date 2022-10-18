package InterfacesGraficas.MarcoBoton;
import javax.swing.JFrame;
public class PruebaBoton {
    public static void main(String[] args) {
        MarcoBoton marcoBoton = new MarcoBoton();
        marcoBoton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoBoton.setSize(800,600);
        marcoBoton.setVisible(true);
    }
}
