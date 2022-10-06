package Figuras;

public class Cuadrado extends Figura {

    private double lado1;



    public Cuadrado(double lado1) {
        this.lado1 = lado1;

    }
    @Override
    public double calcularArea() {
        double a= lado1*lado1;
        return a;
    }

    @Override
    public double calcularPerimetro() {
        return lado1*4;
    }
    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", area=" + calcularArea() +
                "perimetro="+calcularPerimetro()+
                '}';
    }
}
