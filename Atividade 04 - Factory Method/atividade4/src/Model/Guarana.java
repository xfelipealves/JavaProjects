package Model;

public class Guarana extends Refrigerante{
    private String brinde;

    public Guarana(String marca, String tipo, int volume, double preco, String brinde) {
        super(marca, tipo, volume, preco);
        this.brinde = brinde;
    }

    @Override
    public String propaganda() {
        String s = getMarca() + ' ' + getTipo() + ' ' + Integer.toString(getVolume()) +
                ' ' + Double.toString(getPreco()) + ' ' + brinde;
        return s;
    }
}
