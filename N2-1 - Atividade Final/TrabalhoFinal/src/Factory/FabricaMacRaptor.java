package Factory;

import Models.*;

public class FabricaMacRaptor {
    private static FabricaMacRaptor fabricaMacRaptorUnica = null;
    private FabricaMacRaptor() {
    }
    public static FabricaMacRaptor getInstanceFabricaMacRaptor(){
        if (fabricaMacRaptorUnica==null)
            fabricaMacRaptorUnica = new FabricaMacRaptor();
        return fabricaMacRaptorUnica;
    }
    public Produto produzir(){
        return new MacRaptor();
    }
}
