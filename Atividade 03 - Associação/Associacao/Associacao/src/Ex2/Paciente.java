package Ex2;

public class Paciente {
    private String nome;
    private String doenca;

    public Paciente(String nome, String doenca) {
        this.nome = nome;
        this.doenca = doenca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }
}
