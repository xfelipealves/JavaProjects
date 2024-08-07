package Models;

public class Medico extends Autobot{
    public Medico(String nome, int ataque, int vida, int defesa, String especialidade, String descricao) {
        super(nome, ataque, vida, defesa, especialidade, descricao);
    }

    @Override
    public void printCardAutobot(String nome) {
        System.out.println("Nome: "+ super.nome +
                "\nTipo: " + "Medico" +
                "\nDescrição: " + descricao +
                "\nAtaque: " + ataque +
                "\nVida: " + vida +
                "\nDefesa: " + defesa +
                "\nEspecialidade: " + especialidade);
    }
}
