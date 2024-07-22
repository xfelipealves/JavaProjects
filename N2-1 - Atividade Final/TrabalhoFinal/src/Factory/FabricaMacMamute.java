package Factory;

import Models.*;

public class FabricaMacMamute {
    private static FabricaMacMamute fabricaMacMamuteUnica = null;
    private FabricaMacMamute() {
    }
    public static FabricaMacMamute getInstanceFabricaMacMamute(){
        if (fabricaMacMamuteUnica==null)
            fabricaMacMamuteUnica = new FabricaMacMamute();
        return fabricaMacMamuteUnica;
    }
    public Produto produzir(){
        return new MacMamute();
    }
}
