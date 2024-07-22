package Model;

public class Pista {
    private String nome = "Autodromo Internacional de Goiania";
    private static int QuantidadeCorredores = 0;
    private static Pista pistaUnica = null;

    public static Pista getInstancePista()
    {
        if (pistaUnica==null)
            pistaUnica = new Pista();
        return pistaUnica;
    }

    public String getNome() {
        return nome;
    }

    public void setQuantidadeCorredores() {
        QuantidadeCorredores++;
    }

    public static int getQuantidadeCorredores() {
        return QuantidadeCorredores;
    }
}
