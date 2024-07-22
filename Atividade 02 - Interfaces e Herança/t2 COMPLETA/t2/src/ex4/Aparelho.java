package ex4;

public class Aparelho implements Controle{
    private boolean status = false;
    private int volume;

    @Override
    public void power() {
        status = status ^ true;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getStatus() {
        return status;
    }

    public int getVolume() {
        return volume;
    }
}
