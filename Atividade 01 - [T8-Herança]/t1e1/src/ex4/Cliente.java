package ex4;

public class Cliente extends Pessoa{
    private double valorDivida;
    private int anoNascim;

    public Cliente(String nome, int idade, String sexo, double valorDivida, int anoNascim) {
        super(nome, idade, sexo);
        this.valorDivida = valorDivida;
        this.anoNascim = anoNascim;
    }

    protected double getValorDivida() {
        return valorDivida;
    }

    protected void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    protected int getAnoNascim() {
        return anoNascim;
    }

    protected void setAnoNascim(int anoNascim) {
        this.anoNascim = anoNascim;
    }

    public String imprime()
    {
        String s = getNome() + ' ' + Integer.toString(getIdade()) + ' ' + getSexo() + ' ' +
                Double.toString(getValorDivida()) + ' ' + Integer.toString(getAnoNascim());
        return s;
    }
}
