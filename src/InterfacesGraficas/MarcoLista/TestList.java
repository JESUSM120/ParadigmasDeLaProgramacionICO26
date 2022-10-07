package InterfacesGraficas.MarcoLista;

import  javax.swing.JFrame;

public class TestList {
    public static void main(String[] args) {
        MarcoList marcoList = new MarcoList();//create ListFrame object
        marcoList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoList.setSize(800,600);
        marcoList.setVisible(true);
    }
}
