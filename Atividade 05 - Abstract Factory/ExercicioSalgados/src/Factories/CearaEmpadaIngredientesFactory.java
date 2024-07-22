package Factories;

public class CearaEmpadaIngredientesFactory extends SalgadoIngredientesFactory{
    public String criarMassa() {
        return "Crepioca";
    }
    public String criarMolho() {
        return "Camarao";
    }
    public String criarRecheio() {
        return "Peixe";
    }
}
