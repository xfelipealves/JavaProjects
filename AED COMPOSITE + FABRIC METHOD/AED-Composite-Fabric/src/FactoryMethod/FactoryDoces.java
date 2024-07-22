package FactoryMethod;
import models.*;
import Interface.*;

public class FactoryDoces implements Produto {
    private String tipo;
    public enum Doces {
        BOLO, BRIGADEIRO, SORVETE;
    }
    public static Doce produzirDoce(String doce){
        Doces tipoDoce = Doces.valueOf(doce);
        switch (tipoDoce) {
            case BOLO:
                return new Bolo();
            case BRIGADEIRO:
                return new Brigadeiro();
            case SORVETE:
                return new Sorvete();
        }
        return null;
    }

    @Override
    public void listar() {

    }

    @Override
    public String getTipo() {
        return tipo;
    }
}
