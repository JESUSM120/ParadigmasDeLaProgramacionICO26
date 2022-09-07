package Figuras;

public class prueba {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(2,3,4);
        System.out.println(t1.toString());
        Cuadrado c1 = new Cuadrado(24);
        System.out.println(c1.toString());
        Figura t2 = new Triangulo(12,34,12);
        t2.toString();
        Figura c2 = new Cuadrado(23);
        c2.toString();
    }
}