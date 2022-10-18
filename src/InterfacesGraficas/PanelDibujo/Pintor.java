package InterfacesGraficas.PanelDibujo;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pintor {
    public static void main(String[] args) {
        // creates JFrame object
        JFrame aplicacion = new JFrame("A simple drawing program");

        PanelDibujo panelDibujo = new PanelDibujo();
        aplicacion.add(panelDibujo, BorderLayout.CENTER);

        // creates a tag and places it in the BorderLayout SOUTH region
        aplicacion.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(400, 200);
        aplicacion.setVisible(true);
    }

}
