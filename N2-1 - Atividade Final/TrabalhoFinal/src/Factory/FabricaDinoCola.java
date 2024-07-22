package Factory;

import Models.*;

public class FabricaDinoCola {
    private static FabricaDinoCola fabricaDinoColaUnica = null;
    private FabricaDinoCola() {
    }
    public static FabricaDinoCola getInstanceFabricaDinoCola(){
        if (fabricaDinoColaUnica==null)
            fabricaDinoColaUnica = new FabricaDinoCola();
        return fabricaDinoColaUnica;
    }
    public Produto produzir(){
        return new DinoCola();
    }
}
