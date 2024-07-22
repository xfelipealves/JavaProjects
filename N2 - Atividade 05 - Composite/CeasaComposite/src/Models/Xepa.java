package Models;

import Interface.Produto;

import java.util.ArrayList;

public class Xepa implements Produto {
    private ArrayList<Produto> caixa;
    private String nome;
    private double valor;

    public Xepa(String nome) {
        this.nome = nome;
        this.valor = 0;
        this.caixa = new ArrayList<>();
    }

    public void adiciona(Produto produto) {
        this.caixa.add(produto);
        this.valor += produto.getValor();
    }

    public void remove(Produto produto) {
        if(this.caixa.remove(produto)){
            valor -= produto.getValor();
        }
    }
    @Override
    public void imprimir() {
        System.out.println("Xepa: " + nome + " | Valor Total: R$ " + valor);
        for (Produto produto : caixa){
            produto.imprimir();
        }
    }

    @Override
    public double getValor() {
        return valor;
    }
}
