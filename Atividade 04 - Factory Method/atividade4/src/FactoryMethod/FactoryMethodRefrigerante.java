package FactoryMethod;

import Model.Refrigerante;
import Model.CocaCola;
import Model.Guarana;
import Model.Pepsi;

public class FactoryMethodRefrigerante {
    public enum Refrigerantes {
        COCACOLA,GUARANA,PEPSI;
    }

    public static Refrigerante produzirFolder(String marca, String tipo, int volume,
                                              double preco, String promocao, String brinde)
    {
        Refrigerantes tipoRefri = Refrigerantes.valueOf(marca);
        switch (tipoRefri) {
            case COCACOLA:
                return new CocaCola(marca, tipo, volume, preco);
            case PEPSI:
                return new Pepsi(marca, tipo, volume, preco, promocao);
            case GUARANA:
                return new Guarana(marca, tipo, volume, preco, brinde);
        }
        return null;
    }

}
