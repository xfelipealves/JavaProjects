package Models;

public abstract class Autobot {
    protected String nome;
    protected int ataque;
    protected int vida;
    protected int defesa;
    protected String especialidade;
    protected String descricao;

    public Autobot(String nome, int ataque, int vida, int defesa, String especialidade, String descricao) {
        this.nome = nome;
        this.ataque = ataque;
        this.vida = vida;
        this.defesa = defesa;
        this.especialidade = especialidade;
        this.descricao = descricao;
    }

    public void assembleAutobot() {
        System.out.println("Invocando Autobot...");
    }
    public abstract void printCardAutobot (String nome);
}
