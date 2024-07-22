package Models;

public class DinoSoda extends Refrigerante{
    private String nome = "Dino Soda";
    public DinoSoda() {
    }
    @Override
    public String toString() {
        return "Refrigerante = " + nome;
    }
}
