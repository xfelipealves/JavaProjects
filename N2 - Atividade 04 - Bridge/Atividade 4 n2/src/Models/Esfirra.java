package Models;

public class Esfirra extends Salgado{
    public Esfirra(Recheio recheio) {
        super(recheio);
    }

    @Override
    public String toString() {
        return "Salgado produzido: Esfirra." + " " + recheio;
    }
}
