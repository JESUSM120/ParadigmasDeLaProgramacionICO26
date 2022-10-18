package InterfacesGraficas.MarcoDetallesRaton;

import javax.swing.JFrame;

public class DetallesRaton {
    public static void main(String[] args) {
        MarcoDetallesRaton marcoDetallesRaton = new MarcoDetallesRaton();
        marcoDetallesRaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoDetallesRaton.setSize(400,150);
        marcoDetallesRaton.setVisible(true);
    }
}
