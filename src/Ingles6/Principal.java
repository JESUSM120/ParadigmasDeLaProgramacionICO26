package Ingles6;

public class Principal {
    static Iteradores i1 = new Iteradores();
    static Menus m1= new Menus();
    public static void main(String args []){
        do{
            i1.iterador1();
        }while(i1.m1.opcion!=9);
    }
}