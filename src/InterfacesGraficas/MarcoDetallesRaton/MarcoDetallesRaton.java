package InterfacesGraficas.MarcoDetallesRaton;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MarcoDetallesRaton extends JFrame {
    private String detalles;//String displayed in barStatus
    private final JLabel barraEstado;//JLabel that appears at the bottom of the window

    //constructor establece String de la barra de titulo y registra componente de escucha de raton
    public MarcoDetallesRaton() {
        super("Mouse Click and Buttons");

        barraEstado = new JLabel("Click on the mouse");
        add(barraEstado, BorderLayout.SOUTH);
        addMouseListener(new ManejadorClicRaton());//adds the handler
    }

    //internal class to handle mouse events
    private class ManejadorClicRaton extends MouseAdapter {
        //handles mouse click event and determines which button was pressed
        @Override
        public void mouseClicked(MouseEvent evento) {
            int xPos = evento.getX();//Gets the x position of the mouse
            int yPos = evento.getY();//Gets the position and the mouse

            detalles = String.format("Clicked %d time(times)",
                    evento.getClickCount());

            if (evento.isMetaDown())//right mouse button
                detalles += "with the right mouse button";
            else if (evento.isAltDown())//central mouse button
                detalles += " with the central button of the mouse";
            else //central mouse button
                detalles += "with the left mouse button";

            barraEstado.setText(detalles);//displays the message in barStatus

        }
    }

}

