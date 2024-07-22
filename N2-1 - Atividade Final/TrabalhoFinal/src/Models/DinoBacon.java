package Models;

import Decorator.*;

public class DinoBacon extends Personalizacao {
    public DinoBacon(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return produto + " + Extra: DinoBacon";
    }
}
