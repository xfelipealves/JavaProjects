package ex4;

public class Gerente extends Empregado{
    private String nomeGerencia;

    public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    protected String getNomeGerencia() {
        return nomeGerencia;
    }

    protected void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    public String imprime() {
        String s = getNome() + ' ' + Integer.toString(getIdade()) + ' ' + getMatricula() +
                ' ' + getNomeGerencia() + ' ' + Double.toString(valorINSS());
        return s;
    }

    public Gerente(String nome, int idade, double salario, String matricula, String nomeGerencia) {
        super(nome, idade, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }
}
