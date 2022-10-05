package InterfacesGraficas;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame{
    private JLabel etiqueta1;//JLabel solo con texto
    private JLabel etiqueta2;//JLabel construida con tecto y un icono
    private JLabel etiqueta3; //JLabel con texto adiccional e icono

    public LabelFrame(){
        super("Prueba de JLabel");
        setLayout(new FlowLayout());
        //Constructor de JLabel con argumento String
        etiqueta1 = new JLabel("Etiqueta con texto");
        etiqueta1.setToolTipText("Esta es etiqueta1");
        add(etiqueta1);//

        //Constructor de Jlabel con argumentos de cadena, Icono y alineacion
        Icon insecto= new ImageIcon(getClass().getResource("insecto1.png"));
        etiqueta2 = new JLabel("Etiqueta con texto e icono",insecto,SwingConstants.LEFT);
        etiqueta2.setToolTipText("Esta es la etiqueta2");
        add(etiqueta2);// agrega etiqueta2 a JFrame

        etiqueta3 = new JLabel(); // constructor de JLabel sin argumentos
        etiqueta3.setText("Etiqueta con icono y texto en la parte inferior");
        etiqueta3.setIcon(insecto); // agrega icono a JLabel
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("Esta es etiqueta3");
        add(etiqueta3);
    }
}
