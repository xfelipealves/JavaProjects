package ex4;

public class Radio extends Aparelho implements Controle{
    private double faixa;

    public double getFaixa() {
        return faixa;
    }

    public void setFaixa(double faixa) {
        this.faixa = faixa;
    }
}
