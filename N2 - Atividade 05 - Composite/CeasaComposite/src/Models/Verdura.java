package Models;

import Interface.Produto;

public class Verdura implements Produto {
    private String nome;
    private double valor;

    public Verdura(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void imprimir() {
        System.out.println("|--- Produto--Verdura: " + nome + " | Valor: R$ " + Double.toString(valor));
    }
}
