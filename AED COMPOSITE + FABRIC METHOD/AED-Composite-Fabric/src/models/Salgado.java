package models;

import Interface.Produto;

public abstract class Salgado implements Produto {
    @Override
    public void listar() {
        System.out.println(getTipo());
    }
}
