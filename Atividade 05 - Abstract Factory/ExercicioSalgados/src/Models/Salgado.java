package Models;
import Factories.*;

public abstract class Salgado {
    protected SalgadoIngredientesFactory ingredientes;
    protected String massa;
    protected String molho;
    protected String recheio;

    @Override
    public String toString() {
        return "Massa: " + massa +
                " Molho: " + molho +
                " Recheio: " + recheio;
    }
}
