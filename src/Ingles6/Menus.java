package Ingles6;

import java.util.Scanner;
import javax.swing.*;
public class Menus {

    Scanner in = new Scanner (System.in);
    int opcion;

    public Menus() {
        this.opcion = opcion;
    }

    public void menu1(){
        /*String menu = "\t* * * * * * * * * M E N U * * * * * * * * * "
                            +"\n\tV O Z   P A S I V A - A C T I V A"
                            +"\n1.- Pasado Simple"+"\t 4.-Presente Simple"+"\t 7.-Will"
                            +"\n2.- Pasado Continuo"+"\t 5.-Presente Continuo"+"\t 8.- Going to"
                            +"\n3.- Pasado Perfecto"+"\t 6.-Presente Perfecto"
                            +"\n9.- SALIR";*/
        Object seleccion = JOptionPane.showInputDialog(
                null,
                "Seleccione opcion",
                "Convertidor de Voz Activa a Pasiva",
                JOptionPane.QUESTION_MESSAGE,
                null,  // null para icono defecto
                new Object[] { "Pasado Simple", "Pasado Continuo", "Pasado Perfecto"
                        ,"Presente Simple","Presente Continuo","Presente Perfecto"
                        ,"Will","Going to"},
                "Deslice");

        if(seleccion == null){
            opcion=9;
        }else{
            if (seleccion.equals("Pasado Simple")){
                opcion=1;
            }else{
                if (seleccion.equals("Pasado Continuo")){
                    opcion=2;
                }else{
                    if (seleccion.equals("Pasado Perfecto")){
                        opcion=3;
                    }else{
                        if (seleccion.equals("Presente Simple")){
                            opcion=4;
                        }else{
                            if (seleccion.equals("Presente Continuo")){
                                opcion=5;
                            }else{
                                if (seleccion.equals("Presente Perfecto")){
                                    opcion=6;
                                }else{
                                    if (seleccion.equals("Will")){
                                        opcion=7;
                                    }else{
                                        if (seleccion.equals("Going to")){
                                            opcion=8;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }

        }
    }
}


/*System.out.println("\t* * * * * * * * * M E N U * * * * * * * * * ");
            System.out.println("\tV O Z   P A S I V A - A C T I V A ");

            System.out.println("1.- Pasado Simple"+"\t 4.-Presente Simple"+"\t 7.-Will");
            System.out.println("2.- Pasado Continuo"+"\t 5.-Presente Continuo"+"\t 8.- Going to");
            System.out.println("3.- Pasado Perfecto"+"\t 6.-Presente Perfecto");


            System.out.println("9.- SALIR");*/