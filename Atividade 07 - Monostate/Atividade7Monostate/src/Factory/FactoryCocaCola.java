package Factory;

import Model.CocaCola;
import Model.Guarana;
import Model.Refrigerante;

public class FactoryCocaCola extends FactoryRefrigerante{
    @Override
    public Refrigerante criaRefrigerante() {
        return new CocaCola("Coca Cola");
    }
}
