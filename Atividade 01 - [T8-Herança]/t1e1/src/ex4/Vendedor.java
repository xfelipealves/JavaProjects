package ex4;

public class Vendedor extends Empregado{
    private double valorVendas;
    private int qntVendas;

    public Vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorVendas, int qntVendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVendas = valorVendas;
        this.qntVendas = qntVendas;
    }

    protected double getValorVendas() {
        return valorVendas;
    }

    protected void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    protected int getQntVendas() {
        return qntVendas;
    }

    protected void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    public String imprime() {
        String s = getNome() + ' ' + Double.toString(getSalario()) + ' ' + Double.toString(getValorVendas()) +
                ' ' + Integer.toString(getQntVendas());
        return s;
    }

    public Vendedor(String nome, double salario, double valorVendas, int qntVendas) {
        super(nome, salario);
        this.valorVendas = valorVendas;
        this.qntVendas = qntVendas;
    }
}
