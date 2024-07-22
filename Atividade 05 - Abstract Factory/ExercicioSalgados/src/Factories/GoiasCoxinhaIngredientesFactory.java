package Factories;

public class GoiasCoxinhaIngredientesFactory extends SalgadoIngredientesFactory{
    public String criarMassa() {
        return "Fina";
    }
    public String criarMolho() {
        return "Pequi";
    }
    public String criarRecheio() {
        return "Frango";
    }
}
