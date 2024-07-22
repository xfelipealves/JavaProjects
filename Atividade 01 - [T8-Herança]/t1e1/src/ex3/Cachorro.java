package ex3;

public class Cachorro extends Animal{
    private String raca;

    protected String getRaca() {
        return raca;
    }

    protected void setRaca(String raca) {
        this.raca = raca;
    }

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    public String imprime()
    {
        String s = this.getNome() + ' ' + Double.toString(this.getPeso()) + ' ' + raca;
        return s;
    }
}
