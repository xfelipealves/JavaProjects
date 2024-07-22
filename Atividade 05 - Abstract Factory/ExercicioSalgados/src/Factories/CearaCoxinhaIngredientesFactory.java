package Factories;

public class CearaCoxinhaIngredientesFactory extends SalgadoIngredientesFactory{
    public String criarMassa() {
        return "Grossa";
    }
    public String criarMolho() {
        return "Pimenta";
    }
    public String criarRecheio() {
        return "Carne seca";
    }
}
