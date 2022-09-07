package Figuras;

public class Triangulo extends Figura{
    private double lado3;
    private double area;
    private double lado1;
    private double lado2;
    private double perimetro;

    public Triangulo(double lado3, double lado1, double lado2) {
        this.lado3 = lado3;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        //area=(base*altura)/2;
        double s=(lado1+lado2+lado3)/2;
        area=Math.sqrt((s*(s-lado1)*(s-lado2)*(s-lado3)));
        return area;
    }

    @Override
    public double calcularPerimetro() {
        perimetro=lado1+lado2+lado3;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", area=" + calcularArea() +
                "perimetro="+calcularPerimetro()+
                '}';
    }
}
