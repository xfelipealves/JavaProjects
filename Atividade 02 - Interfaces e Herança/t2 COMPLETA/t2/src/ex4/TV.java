package ex4;

public class TV extends Aparelho implements Controle {
    private int canal;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
}
