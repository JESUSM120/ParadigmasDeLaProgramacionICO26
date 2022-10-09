package InterfacesGraficas.PanelDibujo;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pintor {
    public static void main(String[] args) {
        // crea objeto JFrame
        JFrame aplicacion = new JFrame("Un programa simple de dibujo");

        PanelDibujo panelDibujo = new PanelDibujo();
        aplicacion.add(panelDibujo, BorderLayout.CENTER);

        // crea una etiqueta y la coloca en la región SOUTH de BorderLayout
        aplicacion.add(new JLabel("Arrastre el raton para dibujar"), BorderLayout.SOUTH);

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(400, 200);
        aplicacion.setVisible(true);
    }
}
