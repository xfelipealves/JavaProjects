package ex1;

public class Esferografica implements Caneta{
    private String cor;
    @Override
    public void escrever(String texto) {
        System.out.println("Usando " + texto + " à caneta esferográfica.");
    }
    @Override
    public String getCor() {
        return cor;
    }

    public Esferografica(String cor) {
        this.cor = cor;
    }
}
