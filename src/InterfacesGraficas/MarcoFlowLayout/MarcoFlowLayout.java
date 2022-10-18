package InterfacesGraficas.MarcoFlowLayout;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoFlowLayout extends JFrame {
    private final JButton botonJButtonIzquierda; // button to set the alignment to the left
    private final JButton botonJButtonCentro; // button to set alignment to center
    private final JButton botonJButtonDerecha; // button to set the alignment to the right
    private final FlowLayout esquema; // schema object
    private final Container contenedor; // container to set the schema

    // sets the GUI and registers the button listening components
    public MarcoFlowLayout() {
        super("FlowLayout Demo");

        esquema = new FlowLayout();
        contenedor = getContentPane(); // gets container for schema
        setLayout(esquema);
        // sets buttonJButton Left and registers listening component
        botonJButtonIzquierda = new JButton("Left");
        add(botonJButtonIzquierda); // adds Left button to frame
        botonJButtonIzquierda.addActionListener(
                new ActionListener() { // anonymous internal class
                    // processes button eventJButton Left
                    @Override
                    public void actionPerformed(ActionEvent evento) {
                        esquema.setAlignment(FlowLayout.LEFT);

                        // realinea the attached components
                        esquema.layoutContainer(contenedor);
                    }
                }
        );

        // sets buttonJButtonCenter and registers listening component
        botonJButtonCentro = new JButton("Center");
        add(botonJButtonCentro); // adds Center button to frame
        botonJButtonCentro.addActionListener(
                new ActionListener() { // anonymous internal class
                    // processes button eventJButtonCentro
                    @Override
                    public void actionPerformed(ActionEvent evento) {
                        esquema.setAlignment(FlowLayout.CENTER);

                        // realinea the attached components
                        esquema.layoutContainer(contenedor);
                    }
                }
        );

        // sets buttonJButtonRight and registers listening component
        botonJButtonDerecha = new JButton("Right");
        add(botonJButtonDerecha); // adds Right button to frame
        botonJButtonDerecha.addActionListener(
                new ActionListener() { // anonymous internal class

                    // processes button eventJButtonDernet
                    @Override
                    public void actionPerformed(ActionEvent evento) {
                        esquema.setAlignment(FlowLayout.RIGHT);

                        // realinea the attached components
                        esquema.layoutContainer(contenedor);
                    }
                }
        );
    }
}
