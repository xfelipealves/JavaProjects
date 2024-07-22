package FactoryMethod;
import models.*;
import Interface.*;

public class FactorySalgados implements Produto{
    private String tipo;
    public enum Salgados {
        COXINHA,ESFIRRA,QUIBE;
    }
    public static Salgado produzirSalgado(String salgado){
        Salgados tipoSalgado = Salgados.valueOf(salgado);
        switch (tipoSalgado) {
            case COXINHA:
                return new Coxinha();
            case ESFIRRA:
                return new Esfirra();
            case QUIBE:
                return new Quibe();
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
