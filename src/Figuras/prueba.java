package Figuras;

import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        System.out.println("Programa para calcular areas y perimetros de " +
                "figuras.");

        while(!salir){

            System.out.println("1. Triangulo");
            System.out.println("2. Cuadrado");

            System.out.println("Escoge una opcion");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Ha seleccionado triangulo: ");
                    System.out.println("-------------------------------");
                    System.out.print("Ingrese el lado 1: ");
                    double lado1 = sn.nextDouble();
                    System.out.print("Ingrese el lado 2: ");
                    double lado2= sn.nextDouble();
                    System.out.print("Ingrese el lado 3: ");
                    double lado3= sn.nextDouble();
                    Triangulo t1= new Triangulo(lado1,lado2,lado3);
                    System.out.println(t1.toString());

                    break;
                case 2:
                    System.out.println("Ha seleccionado cuadrado:");
                    System.out.println("----------------------------");
                    System.out.println("Ingrese un lado");
                    double cuadrado1= sn.nextDouble();
                    Cuadrado c1 = new Cuadrado(cuadrado1);
                    System.out.println(c1.toString());
                    break;
                case 3:
                    System.out.println("Imprimir datos: "+"\n");
                    System.out.println("Datos de area:");
                    System.out.println();
                case 4:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 3");
            }

        }
    }
}