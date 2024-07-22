package Models;

public class DinoCola extends Refrigerante{
    private String nome = "Dino Cola";
    public DinoCola() {
    }
    @Override
    public String toString() {
        return "Refrigerante = " + nome;
    }
}
