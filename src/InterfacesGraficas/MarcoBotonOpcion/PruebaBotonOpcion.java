package InterfacesGraficas.MarcoBotonOpcion;

import javax.swing.JFrame;

public class PruebaBotonOpcion {
    public static void main(String[] args) {
        MarcoBotonOpcion marcoBotonOpcion = new MarcoBotonOpcion();
        marcoBotonOpcion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoBotonOpcion.setSize(600,100);
        marcoBotonOpcion.setVisible(true);
    }
}
