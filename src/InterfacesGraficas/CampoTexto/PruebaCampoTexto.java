package InterfacesGraficas.CampoTexto;


import javax.swing.JFrame;

import static InterfacesGraficas.CampoTexto.CampoTextoMarco.campoTextoMarco;

public class PruebaCampoTexto {
    public static  void main(String[]args){
        campoTextoMarco = new CampoTextoMarco();
        campoTextoMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        campoTextoMarco.setSize(350,100);
        campoTextoMarco.setVisible(true);
    }
}
