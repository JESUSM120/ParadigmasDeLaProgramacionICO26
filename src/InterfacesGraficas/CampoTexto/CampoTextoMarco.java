package InterfacesGraficas.CampoTexto;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class CampoTextoMarco extends JFrame {
    public static CampoTextoMarco campoTextoMarco;
    private final JTextField campoTexto1;
    private final JTextField campoTexto2;
    private final JTextField campoTexto3;
    private final JPasswordField campoContrasenia;

    public CampoTextoMarco() {
        super("JTextField and JPasswordField test");
        setLayout(new FlowLayout());

        //Construct text field with 10 columns
        campoTexto1 = new JTextField(10);
        add(campoTexto1);

        //construct text field cob default text
        campoTexto2 = new JTextField("Type the text here");
        add(campoTexto2);

        //construct texo field with default text and 21 columns
        campoTexto3 = new JTextField("Non-editable text field", 21);
        campoTexto3.setEditable(false);
        add(campoTexto3);

        //construct password field with default text
        campoContrasenia = new JPasswordField("Hidden text");
        add(campoContrasenia);

        //registers event handlers
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
        campoContrasenia.addActionListener(manejador);
    }

    private class ManejadorCampoTexto implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            String cadena = "";
            //the user pressed enter on the JTextField object fieldText1
            if (evento.getSource() == campoTexto1)
                cadena = String.format("Text2 field: %s",
                        evento.getActionCommand());

                // the user pressed enter on the JTextField object text2 field
            else if (evento.getSource() == campoTexto2)
                cadena = String.format("Text2 field: %s",
                        evento.getActionCommand());

                // the user pressed enter on the jtextfield objecttext3 field
            else if (evento.getSource() == campoTexto3)
                cadena = String.format("Text3 field: %s",
                        evento.getActionCommand());

                // the user pressed enter on the jtextfield objectconsensine field
            else if (evento.getSource() == campoContrasenia)
                cadena = String.format("fieldCondress: %s",
                        evento.getActionCommand());
            //displays the contents of the jtextfield object
            JOptionPane.showMessageDialog(null, cadena);

        }
    }
}
