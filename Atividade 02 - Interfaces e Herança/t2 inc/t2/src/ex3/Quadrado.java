package ex3;

public class Quadrado implements FormaGeometrica{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double comprimento() {
        return lado + lado;
    }

    public double getLado() {
        return lado;
    }
}
