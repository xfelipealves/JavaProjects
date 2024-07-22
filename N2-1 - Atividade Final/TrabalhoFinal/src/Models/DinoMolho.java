package Models;

import Decorator.*;

public class DinoMolho extends Personalizacao {
    public DinoMolho(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return produto + " + Extra: DinoMolho";
    }
}
