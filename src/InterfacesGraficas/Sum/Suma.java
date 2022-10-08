package InterfacesGraficas.Sum;

import javax.swing.*;

public class Suma {
    public static void main(String[] args) {
        //Obtiene la entrada del usuario de los dialogos de entrada de JOptionPane
        String primerNumero= JOptionPane.showInputDialog("Introduzca el primer entero");

        String segundoNumero=JOptionPane.showInputDialog("Introduzca el segundo valor");

        //Convierte las entradas String en valores int para usarlos en el calculo
        int numero1=Integer.parseInt(primerNumero);
        int numero2=Integer.parseInt(segundoNumero);

        int suma = numero1 + numero2;
        //Muestra los resultados en el dialogo de mensajes de JOptionPane
        JOptionPane.showInputDialog(null, "La suma es: "+suma, "Suma de dos enteros"
        , JOptionPane.PLAIN_MESSAGE);
    }
}//fin de la clase Suma
