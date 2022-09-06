package Figuras;

public class prueba {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo (12,12,12,12,12);
        System.out.println("El area del triangulo es " + triangulo.getArea() +
                " y su perimetro es " + triangulo.getPerimetro());
    }
}