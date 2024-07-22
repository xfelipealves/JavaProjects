package Models;

public class Lider extends Autobot{
    public Lider(String nome, int ataque, int vida, int defesa, String especialidade, String descricao) {
        super(nome, ataque, vida, defesa, especialidade, descricao);
    }

    @Override
    public void printCardAutobot(String nome) {
        System.out.println("Nome: "+ super.nome +
                "\nTipo: " + "Lider" +
                "\nDescrição: " + descricao +
                "\nAtaque: " + ataque +
                "\nVida: " + vida +
                "\nDefesa: " + defesa +
                "\nEspecialidade: " + especialidade);
    }
}
