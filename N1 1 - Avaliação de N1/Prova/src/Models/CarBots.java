package Models;

public class CarBots extends Autobot{
    public CarBots(String nome, int ataque, int vida, int defesa, String especialidade, String descricao) {
        super(nome, ataque, vida, defesa, especialidade, descricao);
    }

    @Override
    public void printCardAutobot(String nome) {
        System.out.println("Nome: "+ super.nome +
                "\nTipo: " + "CarBots" +
                "\nDescrição: " + descricao +
                "\nAtaque: " + ataque +
                "\nVida: " + vida +
                "\nDefesa: " + defesa +
                "\nEspecialidade: " + especialidade);
    }
}
