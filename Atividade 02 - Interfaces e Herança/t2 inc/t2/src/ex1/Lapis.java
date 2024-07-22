package ex1;

public class Lapis implements Caneta{
    private String cor;
    @Override
    public void escrever(String texto) {
        System.out.println("Usando " + texto + " à lápis.");
    }
    @Override
    public String getCor() {
        return cor;
    }

    public Lapis(String cor) {
        this.cor = cor;
    }
}
