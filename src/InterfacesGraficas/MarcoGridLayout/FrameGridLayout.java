package InterfacesGraficas.MarcoGridLayout;

import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FrameGridLayout extends JFrame implements ActionListener {
    private final JButton[] buttons; // buttonarrangement
    private static final String[] names = {"one", "two", "three", "four", "five", "six"};
    private boolean toggle = true; // alternates between two schemes
    private Container container; // frame container
    private GridLayout grid1; // first GridLayout object
    private GridLayout grid2; // second GridLayout object

    // constructor without arguments
    public FrameGridLayout() {
        super("GridLayou Demo");
        grid1 = new GridLayout(2, 3, 5, 5); // 2 by 3; spaces of 5
        grid2 = new GridLayout(3, 2); // 3 by 2; no spaces
        container = getContentPane();
        setLayout(grid1);
        buttons = new JButton[names.length];

        for (int count = 0; count < names.length; count++) {
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this); // records listening component
            add(buttons[count]); // add button to JFrame object
        }
    }

    // handles button events, toggling between the following schemes
    @Override
    public void actionPerformed(ActionEvent event) {
        if (toggle) // establishes a scheme based on alternating
        {
            container.setLayout(grid2);
        } else {
            container.setLayout(grid1);
        }

        toggle = !toggle;
        container.validate(); // redistributes the container
    }
}