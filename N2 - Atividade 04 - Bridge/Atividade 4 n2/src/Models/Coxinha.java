package Models;

public class Coxinha extends Salgado{
    public Coxinha(Recheio recheio) {
        super(recheio);
    }

    @Override
    public String toString() {
        return "Salgado produzido: Coxinha." + " " + recheio;
    }
}
