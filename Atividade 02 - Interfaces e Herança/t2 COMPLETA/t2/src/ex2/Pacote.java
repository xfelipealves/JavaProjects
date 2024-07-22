package ex2;

public class Pacote extends Encomenda{
    private double peso;
    private String descricao;

    public Pacote(String identificador, String cidadeOrigem, String cidadeDestino, double peso, String descricao) {
        super(identificador, cidadeOrigem, cidadeDestino);
        this.peso = peso;
        this.descricao = descricao;
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

    public double getPeso() {
        return peso;
    }

    public String getDescricao() {
        return descricao;
    }
}
