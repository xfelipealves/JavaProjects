package ex2;

public class Revista extends Encomenda{
    private String titulo;
    private int mes;

    public Revista(String identificador, String cidadeOrigem, String cidadeDestino, String titulo, int mes) {
        super(identificador, cidadeOrigem, cidadeDestino);
        this.titulo = titulo;
        this.mes = mes;
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

    public String getTitulo() {
        return titulo;
    }

    public int getMes() {
        return mes;
    }
}
