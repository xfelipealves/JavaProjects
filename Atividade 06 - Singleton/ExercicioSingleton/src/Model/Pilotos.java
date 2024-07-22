package Model;

public class Pilotos {
    private String nome = "";
    private Pista pistaCorrida = null;

    public Pilotos(String nome, Pista pistaCorrida) {
        this.nome = nome;
        this.pistaCorrida = pistaCorrida;
        pistaCorrida.setQuantidadeCorredores();
    }

    @Override
    public String toString() {
        String saida = "Dados do Corredor  " +
                "\nNome: " + nome
                + "\nNome da Pista: " + pistaCorrida.getNome()
                + "\nID Pista " + pistaCorrida.hashCode()
                + "\nQuantidade de corredores: " + Pista.getQuantidadeCorredores() + "\n";
        return saida;
    }
}
