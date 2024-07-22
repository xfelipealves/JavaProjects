package Model;

public class CocaCola extends Refrigerante {
    public CocaCola(String marca, String tipo, int volume, double preco) {
        super(marca, tipo, volume, preco);
    }

    @Override
    public String propaganda() {
        String s = getMarca() + ' ' + getTipo() + ' ' +
                Integer.toString(getVolume()) + ' ' + Double.toString(getPreco());
        return s;
    }
}
