package InterfacesGraficas.LabelFrame;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame{
    private JLabel etiqueta1;//JLabel text only
    private JLabel etiqueta2;//JLabel built with tecto and an icon
    private JLabel etiqueta3; //JLabel with addictive text and icon

    public LabelFrame(){
        super("JLabel Test");
        setLayout(new FlowLayout());
        //JLabel constructor with String argument
        etiqueta1 = new JLabel("Label with text");
        etiqueta1.setToolTipText("This is label1");
        add(etiqueta1);//

        //Jlabel constructor with string, icon, and alignment arguments
        Icon insecto= new ImageIcon(getClass().getResource("Insect-Transparent-Images.png"));
        etiqueta2 = new JLabel("Label with text and icon",insecto,SwingConstants.LEFT);
        etiqueta2.setToolTipText("This is the label2");
        add(etiqueta2);// agrega etiqueta2 a JFrame

        etiqueta3 = new JLabel(); // constructor de JLabel sin argumentos
        etiqueta3.setText("Label with icon and text at the bottom");
        etiqueta3.setIcon(insecto); // agrega icono a JLabel
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("This is label3");
        add(etiqueta3);
    }

}
