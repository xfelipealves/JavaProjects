package model;

import Decorator.Tipo;

public class Branco extends Tipo {
    public Branco(Chocolate chocolate) {
        this.chocolate = chocolate;
    }
    @Override
    public String getDescricao() {
        return chocolate.getDescricao() + ", Tipo: Branco";
    }
}
