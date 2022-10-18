package InterfacesGraficas.Sum;

import javax.swing.*;

public class Suma {
    public static void main(String[] args) {
        //Gets user input from JOptionPane input dialogs
        String primerNumero= JOptionPane.showInputDialog("Enter the first integer");

        String segundoNumero=JOptionPane.showInputDialog("Enter the second value");

        //Converts String entries to int values for use in calculation
        int numero1=Integer.parseInt(primerNumero);
        int numero2=Integer.parseInt(segundoNumero);

        int suma = numero1 + numero2;
        //Displays the results in the JOptionPane message dialog
        JOptionPane.showInputDialog(null, "The sum is: "+suma, "Sum of two integers"
                , JOptionPane.PLAIN_MESSAGE);
    }
}//end of the Sum class
