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

    public CampoTextoMarco(){
        super("Prueba de JTextField y JPasswordField");
        setLayout(new FlowLayout());

        //Construye campo de texto con 10 columnas
        campoTexto1= new JTextField(10);
        add(campoTexto1);

        //construye campo de texto cob texto predeterminado
        campoTexto2 = new JTextField("Escriba el texto aqui");
        add(campoTexto2);

        //contruye campo de texo con texto predeterminado y 21 columnas
        campoTexto3 = new JTextField("Campo de texto no editable",21);
        campoTexto3.setEditable(false);
        add(campoTexto3);

        //construye campo de contraseña con texto predeterminado
        campoContrasenia = new JPasswordField("Texto oculto");
        add(campoContrasenia);

        //registra los manejadores de eventos
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
        campoContrasenia.addActionListener(manejador);
    }
    private class ManejadorCampoTexto implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            String cadena = "";
            //el usuario oprimio Intro en el objeto JTextField campoTexto1
            if(evento.getSource()==campoTexto1)
                cadena = String.format("campoTexto2: %s",
                        evento.getActionCommand());

            // el usuario oprimió Intro en el objeto JTextField campoTexto2
            else if(evento.getSource()==campoTexto2)
                cadena = String.format("campoTexto2: %s",
                        evento.getActionCommand());

            // el usuario oprimió Intro en el objeto JTextField campoTexto3
            else if(evento.getSource()==campoTexto3)
                cadena = String.format("campoTexto3: %s",
                        evento.getActionCommand());

            // el usuario oprimió Intro en el objeto JTextField campoContrasenia
            else if(evento.getSource()==campoContrasenia)
                cadena = String.format("campoContraseña: %s",
                        evento.getActionCommand());
            //muestra el contenido del objeto JTextField
            JOptionPane.showMessageDialog(null, cadena);

        }
    }
}
