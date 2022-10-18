package InterfacesGraficas.MarcoDemoTeclas;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MarcoDemoTeclas extends JFrame implements KeyListener {
    private String linea1 = ""; // first line of the text area
    private String linea2 = ""; // second line of the text area
    private String linea3 = ""; // third line of the text area
    private JTextArea areaTexto; // text area to display output

    public MarcoDemoTeclas() {
        super("Demonstration of keystroke events");

        areaTexto = new JTextArea(10, 15); // sets the JTextArea object
        areaTexto.setText("Press any key on the keyboard...");
        areaTexto.setEnabled(false);
        areaTexto.setDisabledTextColor(Color.BLACK);
        add(areaTexto); // adds the text area to JFrame

        addKeyListener(this); // allows the frame to process key events
    }

    // handles the event of pressing any key
    @Override
    public void keyPressed(KeyEvent evento) {
        linea1 = String.format("Pressed key: %s", KeyEvent.getKeyText(evento.getKeyCode())); // displays the pressed key
        establecerLineas2y3(evento); // sets out lines two and three
    }

    // maneja el evento de liberar cualquier tecla
    @Override
    public void keyReleased(KeyEvent evento) {
        linea1 = String.format("Unlocked key: %s", KeyEvent.getKeyText(evento.getKeyCode())); // shows the freed key
        establecerLineas2y3(evento); // sets out lines two and three
    }

    @Override
    public void keyTyped(KeyEvent evento) {
        linea1 = String.format("Pressed key: %s", evento.getKeyChar());
        establecerLineas2y3(evento); // sets out lines two and three
    }

    // sets out lines two and three
    private void establecerLineas2y3(KeyEvent evento) {
        linea2 = String.format("this %s key is a kill key", (evento.isActionKey() ? "" : "no "));

        String temp = KeyEvent.getKeyModifiersText(evento.getModifiers());

        linea3 = String.format("Pressed modifier keys: %s", (temp.equals("") ? "no" : temp)); // prints modifiers

        areaTexto.setText(String.format("%s\n%s\n%s\n", linea1, linea2, linea3)); // prints three lines of text
    }

}