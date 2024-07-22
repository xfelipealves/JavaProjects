package ex5;

public class Cachorro implements Mamifero{
    private String raca;

    public Cachorro(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public void caminhar() {

    }

    @Override
    public void alimentar() {

    }
}
