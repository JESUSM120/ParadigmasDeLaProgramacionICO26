package InterfacesGraficas.MarcoAreaTexto;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class TextAreaFrame extends JFrame {

    private final JTextArea TextArea1; // sample demonstration chain
    private final JTextArea TextArea2; // the highlighted text is copied here
    private final JButton copyButton; // starts copying text

    // constructor without arguments
    public TextAreaFrame() {
        super("JTextArea Demo");
        Box box = Box.createHorizontalBox(); // create a picture
        String demo = "This is a demo string for\n"
                + "illustrate how to copy text\n from a text area to \n"
                + "another, using an\nexternal event\n";

        TextArea1 = new JTextArea(demo, 10, 15);
        box.add(new JScrollPane(TextArea1)); // adds scrolling panel

        copyButton = new JButton("Copy >>>"); // create copy button
        box.add(copyButton); // add copy button to the box
        copyButton.addActionListener(new ActionListener() // anonymous internal class
                                     {
                                         // sets the text in areaText2 with the text selected from areaText1
                                         @Override
                                         public void actionPerformed(ActionEvent event) {
                                             TextArea2.setText(TextArea1.getSelectedText());
                                         }
                                     }
        );

        TextArea2 = new JTextArea(10, 15);
        TextArea2.setEditable(false);
        box.add(new JScrollPane(TextArea2)); // adds scrolling panel

        add(box); // add frame to frame
    }
} // end of class TextAreaFrame