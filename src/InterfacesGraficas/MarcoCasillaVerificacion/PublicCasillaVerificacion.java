package InterfacesGraficas.MarcoCasillaVerificacion;

import  javax.swing.JFrame;
public class PublicCasillaVerificacion {
    public static void main(String[] args) {
        MarcoCasillaVerificacion marcoCasillaVerificacion = new MarcoCasillaVerificacion();
        marcoCasillaVerificacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoCasillaVerificacion.setSize(600,100);
        marcoCasillaVerificacion.setVisible(true);
    }
}
