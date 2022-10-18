package InterfacesGraficas.PanelDibujo;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel {
    private final ArrayList<Point> puntos = new ArrayList<>();
    public PanelDibujo() {
        addMouseMotionListener(
                new MouseMotionAdapter() {
                    @Override
                    public void mouseDragged(MouseEvent evento) {
                        puntos.add(evento.getPoint());
                        repaint();
                    }
                }
        );
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // clears the drawing area

        // draw all points
        for (Point punto : puntos) {
            g.fillOval(punto.x, punto.y, 4, 4);
        }
    }

}