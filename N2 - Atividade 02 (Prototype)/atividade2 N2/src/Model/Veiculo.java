package Model;

import java.util.ArrayList;

public abstract class Veiculo {
    public ArrayList<Pneu> pneus;

    public Veiculo() {
        pneus = new ArrayList<>();
    }
}