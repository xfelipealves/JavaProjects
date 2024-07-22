package Factory;

import Models.*;

public class FabricaMacRex {
    private static FabricaMacRex fabricaMacRexUnica = null;
    private FabricaMacRex() {
    }
    public static FabricaMacRex getInstanceFabricaMacRex(){
        if (fabricaMacRexUnica==null)
            fabricaMacRexUnica = new FabricaMacRex();
        return fabricaMacRexUnica;
    }
    public Produto produzir(){
        return new MacRex();
    }
}
