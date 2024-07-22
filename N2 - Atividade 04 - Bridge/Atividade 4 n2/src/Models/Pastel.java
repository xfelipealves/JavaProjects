package Models;

public class Pastel extends Salgado{
    public Pastel(Recheio recheio) {
        super(recheio);
    }

    @Override
    public String toString() {
        return "Salgado produzido: Pastel." + " " + recheio;
    }
}
