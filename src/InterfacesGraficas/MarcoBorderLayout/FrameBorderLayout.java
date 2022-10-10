package InterfacesGraficas.MarcoBorderLayout;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FrameBorderLayout extends JFrame implements ActionListener {
    private final JButton buttons[]; // arrangement of buttons to hide portions
    private static final String names[] = {"Hide North", "Hide South", "Hide East", "Hide West", "Hide Center"};
    private final BorderLayout schema;

    // establishes the GUI and event handling
    public FrameBorderLayout() {
        super("BorderLayout Demo");

        schema = new BorderLayout(5, 5); // 5 pixel spacing
        setLayout(schema);
        buttons = new JButton[names.length];
        // creates JButton objects and registers listener components for them

        for (int count = 0; count < names.length; count++) {
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this);
        }

        add(buttons[0], BorderLayout.NORTH);
        add(buttons[1], BorderLayout.SOUTH);
        add(buttons[2], BorderLayout.EAST);
        add(buttons[3], BorderLayout.WEST);
        add(buttons[4], BorderLayout.CENTER);
    }
// handles button events

    @Override
    public void actionPerformed(ActionEvent event) {
        // checks the source of the event and distributes the content pane accordingly
        for (JButton button : buttons) {
            if (event.getSource() == button) {
                button.setVisible(false); // hides the pressed button
            } else {
                button.setVisible(true); // shows the other buttons
            }
        }

        schema.layoutContainer(getContentPane()); // distributes the content panel
    }
}