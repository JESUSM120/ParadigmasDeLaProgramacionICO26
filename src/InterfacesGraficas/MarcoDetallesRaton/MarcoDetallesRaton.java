package InterfacesGraficas.MarcoDetallesRaton;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MarcoDetallesRaton extends JFrame {
    private String detalles;//String que se muestra en barraEstado
    private final JLabel barraEstado;//JLabel que aparece en la parte inferior de la ventana

    //constructor establece String de la barra de titulo y registra componente de escucha de raton
    public MarcoDetallesRaton() {
        super("Clic y Botones del raton");

        barraEstado = new JLabel("Haga clic en el raton");
        add(barraEstado, BorderLayout.SOUTH);
        addMouseListener(new ManejadorClicRaton());//agrega el manejador
    }

    //clase interna para manejar los eventos del raton
    private class ManejadorClicRaton extends MouseAdapter {
        //maneja evento de clic del raton y determina cual boton se oprimio
        @Override
        public void mouseClicked(MouseEvent evento) {
            int xPos = evento.getX();//Obtiene la posicion x del raton
            int yPos = evento.getY();//Obtiene la posicion y del raton

            detalles = String.format("Se hizo clic %d vez(veces)",
                    evento.getClickCount());

            if (evento.isMetaDown())//boton derecho del raton
                detalles += "con el boton derecho del raton";
            else if (evento.isAltDown())//boton central del raton
                detalles += " con el boton central del raton";
            else //boton izquierda del raton
                detalles += "con el boton izquierdo del raton";

            barraEstado.setText(detalles);//muestra el mensaje en barraEstado

        }
    }
}

