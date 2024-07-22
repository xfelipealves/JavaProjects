package Factory;

import Models.*;

public class FabricaDinoSoda {
    private static FabricaDinoSoda fabricaDinoSodaUnica = null;
    private FabricaDinoSoda() {
    }
    public static FabricaDinoSoda getInstanceFabricaDinoSoda(){
        if (fabricaDinoSodaUnica==null)
            fabricaDinoSodaUnica = new FabricaDinoSoda();
        return fabricaDinoSodaUnica;
    }
    public Produto produzir(){
        return new DinoSoda();
    }
}
