package ex4;

public class Aparelho implements Controle{
    private boolean status;
    private int volume;

    @Override
    public void power() {

    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
