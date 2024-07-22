package ex1;

public class Giz implements Caneta{
    private String cor;
    @Override
    public void escrever(String texto) {
        System.out.println("Usando " + texto + " com giz");
    }
    @Override
    public String getCor() {
        return cor;
    }

    public Giz(String cor) {
        this.cor = cor;
    }
}
