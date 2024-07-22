package models;

import Interface.Produto;
import java.util.ArrayList;

public class CaixaCafeManha implements Produto {
    private ArrayList<Produto> caixa;
    private String nome;
    private String tipo;

    public CaixaCafeManha(String nome, String tipo) {
        this.caixa = new ArrayList<>();
        this.nome = nome;
        this.tipo = tipo;
    }
    public void adiciona(Produto produto) {
        this.caixa.add(produto);
    }

    public void remove(Produto produto) {
        this.caixa.remove(produto);
    }
    @Override
    public void listar() {
        System.out.println("Caixa café da manhã: " + nome + " Tipo: " + tipo);
        for (Produto produto : caixa){
            produto.listar();
        }
    }

    @Override
    public String getTipo() {
        return tipo;
    }
}
