package InterfacesGraficas.MarcoBorderLayout;

import javax.swing.JFrame;

public class DemoBorderLayout {
    public static void main(String[] args) {
        FrameBorderLayout frameBorderLayout = new FrameBorderLayout();
        frameBorderLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameBorderLayout.setSize(300, 200);
        frameBorderLayout.setVisible(true);
    }
} // end of DemoBorderLayout class