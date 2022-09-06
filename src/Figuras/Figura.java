package Figuras;

public abstract class Figura {
    protected double area;
    protected double perimetro;
    public double getArea() {
        return area;
    }
    public double getPerimetro() {
        return perimetro;
    }

    protected abstract void calcularArea();

    protected abstract void calcularPerimetro();
}
