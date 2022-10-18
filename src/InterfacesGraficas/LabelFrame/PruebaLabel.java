package InterfacesGraficas.LabelFrame;

import javax.swing.JFrame;

public class PruebaLabel {
    public static void main(String[] args) {
        LabelFrame marcoEtiqueta = new LabelFrame();
        marcoEtiqueta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoEtiqueta.setSize(1366, 768);
        marcoEtiqueta.setVisible(true);
    }
}
