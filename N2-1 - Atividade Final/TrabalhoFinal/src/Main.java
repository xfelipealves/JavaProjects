import Factory.*;
import Models.*;

public class Main {
    public static void main(String[] args) {
        //Fabrica de Sanduíches
        FabricaMacMamute fabricaMacMamute = FabricaMacMamute.getInstanceFabricaMacMamute();
        FabricaMacRex fabricaMacRex = FabricaMacRex.getInstanceFabricaMacRex();
        FabricaMacRaptor fabricaMacRaptor = FabricaMacRaptor.getInstanceFabricaMacRaptor();
        //Fabrica de Acompanhamentos
        FabricaMacOvoFrito fabricaMacOvoFrito = FabricaMacOvoFrito.getInstanceFabricaMacOvoFrito();
        FabricaMacBatata fabricaMacBatata = FabricaMacBatata.getInstanceFabricaMacBatata();
        //Fabrica de Refrigerantes
        FabricaDinoCola fabricaDinoCola = FabricaDinoCola.getInstanceFabricaDinoCola();
        FabricaDinoSoda fabricaDinoSoda = FabricaDinoSoda.getInstanceFabricaDinoSoda();

        //Pedido 1
        Produto produto1 = fabricaMacRex.produzir();
        produto1 = new DinoMolho(new DinoBacon(produto1));

        Produto produto2 = new DinoBacon(new DinoMolho(fabricaMacBatata.produzir()));
        Produto produto3 = fabricaDinoSoda.produzir();

        Combo combo1 = new Combo("Combo Feroz");
        combo1.adiciona(produto1);
        combo1.adiciona(produto2);
        combo1.adiciona(produto3);

        System.out.println("Pedido 1: " + combo1);

        //Pedido 2
        Produto produto4 = new DinoBacon(fabricaMacMamute.produzir());
        Produto produto5 = new DinoMolho(fabricaMacOvoFrito.produzir());
        Produto produto6 = fabricaDinoCola.produzir();
        Combo combo2 = new Combo("Combo Perigoso");
        combo2.adiciona(produto4);
        combo2.adiciona(produto5);
        combo2.adiciona(produto6);

        System.out.println("Pedido 2: " + combo2);

        //Pedido 3
        Produto produto7 = new DinoMolho(fabricaMacRaptor.produzir());
        Combo combo3 = new Combo("Combo Jurrasic Park");
        combo3.adiciona(produto7);
        combo3.adiciona(combo1);
        combo3.adiciona(combo2);

        System.out.println("Peiddo 3: " + combo3);
    }
}