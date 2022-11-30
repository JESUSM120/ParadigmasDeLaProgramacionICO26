package Ingles6;

import javax.swing.JOptionPane;

public class Iteradores {
    Menus m1 = new Menus();
    String sujeto, VtoB, objeto , verbo,complemento;
    String oracion;
    int x;
    public void seleccion(){
        String[] options = {"Singular","Plural"};

        x = JOptionPane.showOptionDialog(null, "A que grupo pertenece tu objeto",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

    }
    public void pedirDatos(){
        sujeto = JOptionPane.showInputDialog("Sujeto");
        objeto = JOptionPane.showInputDialog("Objeto");
        seleccion();
        if(x==1){
            VtoB= "were";
        }else{
            VtoB= "was";
        }
        verbo = JOptionPane.showInputDialog("Verbo");
        complemento = JOptionPane.showInputDialog("Complemento");
    }

    public void iterador1(){
        m1.menu1();
        switch(m1.opcion){
            case 1:
                pedirDatos();
                oracion = objeto +" "+ VtoB +" "+ verbo + " by "+ sujeto +" "+complemento;
                JOptionPane.showMessageDialog(null, oracion);
                break;
            case 2:
                pedirDatos();
                oracion = objeto +" "+ VtoB +" being "+ verbo + " "+complemento;
                JOptionPane.showMessageDialog(null, oracion);
                break;
            case 3:
                pedirDatos();
                oracion = objeto +" had been"+ verbo + " "+complemento;
                JOptionPane.showMessageDialog(null, oracion);
                break;
            case 4:
                pedirDatos();
                oracion = objeto +" "+ VtoB +" "+ verbo + " by "+ sujeto +" "+complemento;
                JOptionPane.showMessageDialog(null, oracion);
                break;
            case 5:
                pedirDatos();
                oracion = objeto +" "+ VtoB +" "+ verbo + " by "+ sujeto +" "+complemento;
                JOptionPane.showMessageDialog(null, oracion);
                break;
            case 6:
                pedirDatos();
                oracion = objeto +" "+ VtoB +" "+ verbo + " by "+ sujeto +" "+complemento;
                JOptionPane.showMessageDialog(null, oracion);
                break;
            case 7:
                pedirDatos();
                oracion = objeto +" will "+ verbo + " by "+ sujeto +" "+complemento;
                JOptionPane.showMessageDialog(null, oracion);
                break;
            case 8:
                pedirDatos();
                oracion = objeto +" "+ VtoB +" going to "+ verbo + " by "+ sujeto +" "+complemento;
                JOptionPane.showMessageDialog(null, oracion);
                break;
            case 9:
                System.out.println("Saliendo...");
                break;
            default:
                String error = "El numero ingresado no esta en la lista";
                JOptionPane.showMessageDialog(null, error);
                break;
        }
    }
}