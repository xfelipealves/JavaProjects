package Factory;

import Models.*;

public class FabricaMacBatata {
    private static FabricaMacBatata fabricaMacBatataUnica = null;
    private FabricaMacBatata() {
    }
    public static FabricaMacBatata getInstanceFabricaMacBatata(){
        if (fabricaMacBatataUnica==null)
            fabricaMacBatataUnica = new FabricaMacBatata();
        return fabricaMacBatataUnica;
    }
    public Produto produzir(){
        return new MacBatata();
    }
}
