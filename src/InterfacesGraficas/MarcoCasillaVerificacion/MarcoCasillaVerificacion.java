package InterfacesGraficas.MarcoCasillaVerificacion;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class MarcoCasillaVerificacion extends JFrame {
    private JTextField campoTexto;//Displays text in changing types
    private JCheckBox negritaJCheckBox;//to select/deselect bold
    private JCheckBox cursivaJCheckBox;//to select/deselect italics

    //MarcoCasillaVerification constructor adds JCheckBox objects to JFrame
    public MarcoCasillaVerificacion() {
        super("JCheckBox Test");
        setLayout(new FlowLayout());
        //sets JTextField and its font
        campoTexto = new JTextField("notice how the type style changes" +
                "of letter", 20);
        campoTexto.setFont(new Font("Serif", Font.PLAIN, 14));
        add(campoTexto);//adds Textfield to JFrame

        negritaJCheckBox = new JCheckBox("Boldface");
        cursivaJCheckBox = new JCheckBox("Italics");
        add(negritaJCheckBox);//adds "bold" checkbox to JFrame
        add(cursivaJCheckBox);//adds "italics" checkbox to JFrame

        //registers listener components for JCheckBox objects
        ManejadorCheckBox manejador = new ManejadorCheckBox();
        negritaJCheckBox.addItemListener(manejador);
        cursivaJCheckBox.addItemListener(manejador);
    }

    //private internal class for handling ItemListener events
    private class ManejadorCheckBox implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent evento) {
            Font tipoletra = null; //stores the new Font object
            //determines which CheckBox objects are selected
            //and creates the font object
            if (negritaJCheckBox.isSelected() && cursivaJCheckBox.isSelected())
                tipoletra = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if (negritaJCheckBox.isSelected())
                tipoletra = new Font("Serif", Font.BOLD, 14);
            else if (cursivaJCheckBox.isSelected())
                tipoletra = new Font("Serif", Font.ITALIC, 14);
            else
                tipoletra = new Font("Serif", Font.PLAIN, 14);

            campoTexto.setFont(tipoletra);

        }
    }

}

