package Model;

public class Pepsi extends Refrigerante{
    private String promocao;

    public Pepsi(String marca, String tipo, int volume, double preco, String promocao) {
        super(marca, tipo, volume, preco);
        this.promocao = promocao;
    }

    @Override
    public String propaganda() {
        String s = getMarca() + ' ' + getTipo() + ' ' + Integer.toString(getVolume()) +
                ' ' + Double.toString(getPreco()) + ' ' + promocao;
        return s;
    }


}
