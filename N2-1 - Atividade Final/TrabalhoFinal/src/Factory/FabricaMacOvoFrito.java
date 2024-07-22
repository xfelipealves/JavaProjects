package Factory;

import Models.*;

public class FabricaMacOvoFrito {
    private static FabricaMacOvoFrito fabricaMacOvoFritoUnica = null;
    private FabricaMacOvoFrito() {
    }
    public static FabricaMacOvoFrito getInstanceFabricaMacOvoFrito(){
        if (fabricaMacOvoFritoUnica==null)
            fabricaMacOvoFritoUnica = new FabricaMacOvoFrito();
        return fabricaMacOvoFritoUnica;
    }
    public Produto produzir(){
        return new MacOvoFrito();
    }
}
