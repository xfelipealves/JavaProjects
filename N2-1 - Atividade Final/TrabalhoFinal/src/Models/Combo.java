package Models;

import java.util.ArrayList;

public class Combo implements Produto{
    private ArrayList<Produto> combo;
    private String nome;
    public Combo(String nome) {
        this.nome = nome;
        combo = new ArrayList<>();
    }
    public void adiciona(Produto produto){
        combo.add(produto);
    }
    public void remove(Produto produto){
        combo.remove(produto);
    }

    @Override
    public String toString() {
        String saida = nome + "\nProdutos:";
        for (Produto produto : combo) {
            saida += "\n" + produto.toString();
        }
        return saida;
    }
}
