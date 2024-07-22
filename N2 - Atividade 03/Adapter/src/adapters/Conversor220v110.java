package adapters;

import devices.*;

public class Conversor220v110 extends Voltagem110{
    private Voltagem220 voltagem220;

    public Conversor220v110(Voltagem220 voltagem220) {
        this.voltagem220 = voltagem220;
    }

    @Override
    public String getEnergia110() {
        return "110v";
    }
}
