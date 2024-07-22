package ex2;

public class Carta extends Encomenda implements Entrega{
    private String texto;

    public Carta(String identificador, String cidadeOrigem, String cidadeDestino, String texto) {
        super(identificador, cidadeOrigem, cidadeDestino);
        this.texto = texto;
    }

    @Override
    public String getIdentificador() {
        return super.getIdentificador();
    }

    @Override
    public String getCidadeOrigem() {
        return super.getCidadeOrigem();
    }

    @Override
    public String getCidadeDestino() {
        return super.getCidadeDestino();
    }

    public String getTexto() {
        return texto;
    }
}
