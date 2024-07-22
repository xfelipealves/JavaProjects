package Factories;

public class GoiasEmpadaIngredientesFactory extends SalgadoIngredientesFactory{
    public String criarMassa() {
        return "Podre";
    }
    public String criarMolho() {
        return "Tomate";
    }
    public String criarRecheio() {
        return "Calabresa";
    }
}
