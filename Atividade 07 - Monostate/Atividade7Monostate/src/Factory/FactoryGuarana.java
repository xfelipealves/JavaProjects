package Factory;

import Model.Guarana;
import Model.Refrigerante;

public class FactoryGuarana extends FactoryRefrigerante{
    @Override
    public Refrigerante criaRefrigerante() {
        return new Guarana("Guarana");
    }
}
