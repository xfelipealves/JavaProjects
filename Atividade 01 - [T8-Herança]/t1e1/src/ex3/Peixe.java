package ex3;

public class Peixe extends Animal{
    private String tipoHabitat;

    protected String getTipoHabitat() {
        return tipoHabitat;
    }

    protected void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    public Peixe(String nome, double peso, String tipoHabitat) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    public String imprime()
    {
        String s = this.getNome() + ' ' + Double.toString(this.getPeso()) + ' ' + tipoHabitat;
        return s;
    }
}
