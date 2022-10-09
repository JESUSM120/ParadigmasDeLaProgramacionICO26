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
    private final JTextField campoTexto;//se utiliza para mostrar los cambios en el tipo de letra

    private final Font tipoLetraSimple;//tipo de letra para texto simple
    private final Font tipoLetraNegrita;//tipo de letra para texto en negrita
    private final Font tipoLetraCursiva;//tipo de letra para texto en cursiva
    private final Font tipoLetraNegritaCursiva;//tipo de letra cursiva en negrita y cursiva

    private final JRadioButton simpleJRadioButton;//selecciona texto simple
    private final JRadioButton negritaJRadioButton;//selecciona texto en negrita
    private final JRadioButton cursivaJRadioButton;//selecciona texto en cursiva
    private final JRadioButton negritaCursivaJRadioButton; //negrita y cursiva
    private  ButtonGroup grupoOpciones;//contiene los botones de opcion

    //El constructor de MarcoBotonOpcion agrega los objetos JRadioButton a JFrame
    public MarcoBotonOpcion(){
        super("Prueba de RadioButton");
        setLayout(new FlowLayout());

        campoTexto = new JTextField("Observe el cambio en el estilo del tipo de" +
                "letra",25);
        add(campoTexto);//agrega campoTexto a JFrame

        //crea los botones de opcion
        simpleJRadioButton = new JRadioButton("Simple",true);
        negritaJRadioButton = new JRadioButton("Negrita",false);
        cursivaJRadioButton = new JRadioButton("Cursiva",false);
        negritaCursivaJRadioButton = new JRadioButton("Negrita/Cursiva",false);
        add(simpleJRadioButton);//agrega boton simple a JFrame
        add(negritaJRadioButton);//agrega boton negrita a JFrame
        add(cursivaJRadioButton);//agrega boton cursiva a JFrame
        add(negritaCursivaJRadioButton);//agrega boton negrita y cursiva

        //crea una relacion logica entre los objeto JRadioButton
        grupoOpciones = new ButtonGroup();//crea ButtonGroup
        grupoOpciones.add(simpleJRadioButton);//crea ButtonGroup
        grupoOpciones.add(negritaJRadioButton);//agrega negrita al grupo
        grupoOpciones.add(cursivaJRadioButton);//agrega cursiva al grupo
        grupoOpciones.add(negritaCursivaJRadioButton);//agrega negrita y cursiva

        //crea objetos tipo de letra
        tipoLetraSimple = new Font("Serif",Font.PLAIN,14);
        tipoLetraNegrita = new Font("Serif",Font.BOLD,14);
        tipoLetraCursiva = new Font("Serif",Font.ITALIC,14);
        tipoLetraNegritaCursiva = new Font("Serif",Font.BOLD+Font.ITALIC,14);
        campoTexto.setFont(tipoLetraSimple);

        //registra eventos para los objetos JRadioButton
        simpleJRadioButton.addItemListener(
                new ManejadorBotonOpcion(tipoLetraSimple));
        negritaJRadioButton.addItemListener(
                new ManejadorBotonOpcion(tipoLetraNegrita));
        cursivaJRadioButton.addItemListener(
                new ManejadorBotonOpcion(tipoLetraCursiva));
        negritaCursivaJRadioButton.addItemListener(
                new ManejadorBotonOpcion(tipoLetraNegritaCursiva));
    }
    //clase interna privada para manejar eventos de botones de opcion
    private class ManejadorBotonOpcion implements ItemListener{
        private Font tipoLetra;//tipo de letra asociado con este componente de escucha
        public ManejadorBotonOpcion(Font f){
            tipoLetra=f;
        }
        //maneja los eventos de botones de opcion
        @Override
        public void itemStateChanged(ItemEvent evento){
            campoTexto.setFont(tipoLetra);
        }
    }
}
