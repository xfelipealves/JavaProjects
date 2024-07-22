package ex2;

public class VIP extends Ingresso{
    private double adicional;

    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public String valorTotal() {
        String s = Double.toString((Double.parseDouble( imprimeValor()) )+ adicional);
        return s;
    }
}
