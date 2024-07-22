package models;

import Interface.Produto;

public abstract class Doce implements Produto {
    @Override
    public void listar() {
        System.out.println(getTipo());
    }
}
