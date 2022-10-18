package InterfacesGraficas.MarcoBoton;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MarcoBoton extends JFrame{
    private final JButton botonJButtonSimple;
    private final JButton botonJButtonElegante;

    //MarcoBoton adds JButton objects to JFrame
    public MarcoBoton(){
        super("Button test");
        setLayout(new FlowLayout());

        botonJButtonSimple = new JButton("Simple Button");
        add(botonJButtonSimple);


        Icon insecto1= new ImageIcon(getClass().getResource("MonaElegante.gif"));
        Icon insecto2= new ImageIcon(getClass().getResource("MonaSimple.gif"));
        botonJButtonElegante = new JButton("Elegant button", insecto1);//Set the image

        botonJButtonElegante.setRolloverIcon(insecto2);//Set the replacement image
        add(botonJButtonElegante);//adds buttonJButtonElegant to JFrame

        // creates new ButtonHand handler to handle button events
        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener(manejador);
        botonJButtonSimple.addActionListener(manejador);
    }
    // internal class for handling button events
    private class  ManejadorBoton implements  ActionListener{
        // handles button event
        @Override
        public void actionPerformed(ActionEvent evento){
            JOptionPane.showMessageDialog(MarcoBoton.this,String.format("Usted oprimio" +
                    ": %s", evento.getActionCommand()));
        }
    }

}// fin de la clase MarcoBoton
