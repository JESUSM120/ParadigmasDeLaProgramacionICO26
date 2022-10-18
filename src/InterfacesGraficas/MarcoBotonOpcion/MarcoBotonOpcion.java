package InterfacesGraficas.MarcoBotonOpcion;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class MarcoBotonOpcion extends JFrame {
    private final JTextField campoTexto;//is used to display changes in the font

    private final Font tipoLetraSimple;//font for simple text
    private final Font tipoLetraNegrita;//font for bold text
    private final Font tipoLetraCursiva;//font for italic text
    private final Font tipoLetraNegritaCursiva;//bold and italic italic font

    private final JRadioButton simpleJRadioButton;//select simple text
    private final JRadioButton negritaJRadioButton;//select bold text
    private final JRadioButton cursivaJRadioButton;//select italic text
    private final JRadioButton negritaCursivaJRadioButton; //bold and italics
    private  ButtonGroup grupoOpciones;//contains the option buttons

    //MarcoBotonOpcion constructor adds JRadioButton objects to JFrame
    public MarcoBotonOpcion(){
        super("RadioButton Test");
        setLayout(new FlowLayout());

        campoTexto = new JTextField("Notice the change in the style of the type of" +
                "letter",25);
        add(campoTexto);//adds Textfield to JFrame

        //crea los botones de opcion
        simpleJRadioButton = new JRadioButton("Simple",true);
        negritaJRadioButton = new JRadioButton("Boldface",false);
        cursivaJRadioButton = new JRadioButton("Italics",false);
        negritaCursivaJRadioButton = new JRadioButton("Bold/Italics",false);
        add(simpleJRadioButton);//adds simple button to JFrame
        add(negritaJRadioButton);//adds bold button to JFrame
        add(cursivaJRadioButton);//adds italic button to JFrame
        add(negritaCursivaJRadioButton);//adds bold and italic button

        //creates a logical relationship between the JRadioButton object
        grupoOpciones = new ButtonGroup();//create ButtonGroup
        grupoOpciones.add(simpleJRadioButton);//create ButtonGroup
        grupoOpciones.add(negritaJRadioButton);//adds bold to the group
        grupoOpciones.add(cursivaJRadioButton);//adds italics to the group
        grupoOpciones.add(negritaCursivaJRadioButton);//adds bold and italics

        //creates font objects
        tipoLetraSimple = new Font("Serif",Font.PLAIN,14);
        tipoLetraNegrita = new Font("Serif",Font.BOLD,14);
        tipoLetraCursiva = new Font("Serif",Font.ITALIC,14);
        tipoLetraNegritaCursiva = new Font("Serif",Font.BOLD+Font.ITALIC,14);
        campoTexto.setFont(tipoLetraSimple);

        //logs events for JRadioButton objects
        simpleJRadioButton.addItemListener(
                new ManejadorBotonOpcion(tipoLetraSimple));
        negritaJRadioButton.addItemListener(
                new ManejadorBotonOpcion(tipoLetraNegrita));
        cursivaJRadioButton.addItemListener(
                new ManejadorBotonOpcion(tipoLetraCursiva));
        negritaCursivaJRadioButton.addItemListener(
                new ManejadorBotonOpcion(tipoLetraNegritaCursiva));
    }
    //private internal class to handle option button events
    private class ManejadorBotonOpcion implements ItemListener{
        private Font tipoLetra;//font associated with this listening component
        public ManejadorBotonOpcion(Font f){
            tipoLetra=f;
        }
        //handles option button events
        @Override
        public void itemStateChanged(ItemEvent evento){
            campoTexto.setFont(tipoLetra);
        }
    }

}
