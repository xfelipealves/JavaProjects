package ex2;

public class Encomenda implements Entrega {
    private String Identificador;
    private String CidadeOrigem;
    private String CidadeDestino;

    public Encomenda(String identificador, String cidadeOrigem, String cidadeDestino) {
        Identificador = identificador;
        CidadeOrigem = cidadeOrigem;
        CidadeDestino = cidadeDestino;
    }

    @Override
    public String getIdentificador() {
        return Identificador;
    }

    @Override
    public String getCidadeOrigem() {
        return CidadeOrigem;
    }

    @Override
    public String getCidadeDestino() {
        return CidadeDestino;
    }
}
