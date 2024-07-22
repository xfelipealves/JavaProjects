package Factories;
import Models.*;

public class SalgadosFactory {
    private SalgadoIngredientesFactory ingredientes;

    private Salgado salgadinho;

    public SalgadosFactory (String tipo, String regiao) {
        ingredientes = tipo == "coxinha" ? regiao == "ceara" ?
                new CearaCoxinhaIngredientesFactory() : new GoiasCoxinhaIngredientesFactory() :
                //Eh Empada
                regiao == "ceara" ?
                        new CearaEmpadaIngredientesFactory() : new GoiasEmpadaIngredientesFactory();
    }

    public void assarSalgado() {
        /*utilize esse método para criar um salgadinho conforme
         tipo (coxinha ou empada) e região (Ceara ou Goias).*/

        salgadinho = ingredientes.getClass().toString().contains("Empada") == true ?
                new Empada(ingredientes.criarMassa(), ingredientes.criarMolho(), ingredientes.criarRecheio()) :
                new Coxinha(ingredientes.criarMassa(), ingredientes.criarMolho(), ingredientes.criarRecheio()) ;
    }

    public SalgadoIngredientesFactory getIngredientesCoxinha(String regiao) {
        return regiao == "ceara" ?  new CearaCoxinhaIngredientesFactory() :
                                    new GoiasCoxinhaIngredientesFactory();
    }

    public SalgadoIngredientesFactory getIngredientesEmpada(String regiao) {
        return regiao == "ceara" ?  new CearaEmpadaIngredientesFactory() :
                                    new GoiasEmpadaIngredientesFactory();
    }

    public Salgado getSalgadinho() {
        return salgadinho;
    }

    @Override
    public String toString() {
        return "Massa: " + ingredientes.criarMassa() +
                " Molho: " + ingredientes.criarMolho() +
                " Recheio: " + ingredientes.criarRecheio();
    }
}
