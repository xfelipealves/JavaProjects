package devices;

public class ArCondicionado {
    private Voltagem110 ligacao;

    public ArCondicionado(Voltagem110 energia) {
        this.ligacao = energia;
    }

    public Voltagem110 getLigacao() {
        return ligacao;
    }

    public void setLigacao(Voltagem110 energia) {
        this.ligacao = energia;
    }

    public boolean testeLigacao(Voltagem110 energia){
        return (energia.getEnergia110() == "110v");
    }
}
