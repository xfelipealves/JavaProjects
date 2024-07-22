package ex3;

public class Animal {
    private String nome;
    private double peso;

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected double getPeso() {
        return peso;
    }

    protected void setPeso(double peso) {
        this.peso = peso;
    }

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String imprime()
    {
        String s = nome + ' ' + Double.toString(peso);
        return s;
    }

}
