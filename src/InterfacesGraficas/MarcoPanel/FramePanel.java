package InterfacesGraficas.MarcoPanel;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class FramePanel extends JFrame {
    private final JPanel buttonPanel; // Panel containing the buttons
    private final JButton[] buttons;
    // Constructor without arguments

    public FramePanel() {
        super("Panel Demo");
        buttons = new JButton[5];
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, buttons.length));

        // Create and add buttons
        for (int count = 0; count < buttons.length; count++) {
            buttons[count] = new JButton("Button " + (count + 1));
            buttonPanel.add(buttons[count]); // Adds the button to the panel
        }
        add(buttonPanel, BorderLayout.SOUTH); // Add the panel to JFrame
    }
} // end FramePanel class
