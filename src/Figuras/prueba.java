package Figuras;

public class prueba {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo (12,12,12,12,12);
        Triangulo triangulo2 = new Triangulo (24,34,24,24,24);
        System.out.println("El area del triangulo obtenida es: " + triangulo.getArea());
        System.out.println("EL perimetro  del triangulo es: " +triangulo.getPerimetro());
        System.out.println("El area del triangulo es: "+triangulo2.getArea()+"\nEl perimetro " +
                "es: "+triangulo2.getPerimetro());
    }
}