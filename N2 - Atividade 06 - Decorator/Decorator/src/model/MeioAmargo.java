package model;
import Decorator.*;

public class MeioAmargo extends Tipo{
    public MeioAmargo(Chocolate chocolate) {
        this.chocolate = chocolate;
    }
    @Override
    public String getDescricao() {
        return chocolate.getDescricao() + ", Tipo: Meio Amargo";
    }
}
