package Model;

public abstract class Refrigerante {
    private String marca;
    private String tipo;
    private int volume;
    private double preco;

    public Refrigerante(String marca, String tipo, int volume, double preco) {
        this.marca = marca;
        this.tipo = tipo;
        this.volume = volume;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract String propaganda();
}
