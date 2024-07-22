package ex5;

public class Passaro implements Voador{
    private String especie;

    public Passaro(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public void voar() {

    }

    @Override
    public void comunicar() {

    }
}
