package InterfacesGraficas.MarcoPruebaCombinado;

import javax.swing.*;

public class TestFrameCombined {
    public static void main(String[] args) {
        MarcoCuadroCombinado marcoCuadroCombinado = new MarcoCuadroCombinado();
        marcoCuadroCombinado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoCuadroCombinado.setSize(1366,768);
        marcoCuadroCombinado.setVisible(true);
    }
}
