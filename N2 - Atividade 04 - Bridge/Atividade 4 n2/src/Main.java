import Models.*;

public class Main {
    public static void main(String[] args) {
        Recheio carne = new Carne();
        Recheio frango = new Frango();
        Recheio queijo = new Queijo();

        Salgado coxinha = new Coxinha(frango);
        Salgado coxinha2 = new Coxinha(carne);
        Salgado esfirra = new Esfirra(queijo);
        Salgado pastel = new Pastel(carne);

        System.out.println(coxinha);
        System.out.println(coxinha2);
        System.out.println(esfirra);
        System.out.println(pastel);
    }
}