package InterfacesGraficas.MarcoFlowLayout;

import javax.swing.JFrame;

public class DemoFlowLayout {
    public static void main(String[] args) {
        MarcoFlowLayout marcoFlowLayout = new MarcoFlowLayout();
        marcoFlowLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoFlowLayout.setSize(600, 150);
        marcoFlowLayout.setVisible(true);
    }
}