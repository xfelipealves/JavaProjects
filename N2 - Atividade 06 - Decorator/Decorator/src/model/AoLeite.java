package model;
import Decorator.*;

public class AoLeite extends Tipo{
    public AoLeite(Chocolate chocolate) {
        this.chocolate = chocolate;
    }
    @Override
    public String getDescricao() {
        return chocolate.getDescricao() + ", Tipo: Ao Leite";
    }
}
