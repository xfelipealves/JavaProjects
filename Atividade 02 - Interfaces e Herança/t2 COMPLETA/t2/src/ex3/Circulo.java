package ex3;

public class Circulo implements FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return raio * raio * 3.14;
    }

    @Override
    public double comprimento() {
        return 2 * 3.14 * raio;
    }

    public double getRaio() {
        return raio;
    }
}
