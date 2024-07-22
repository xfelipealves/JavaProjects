package ex2;

public class CamaroteSuperior {
    private String localizacaoIngresso;
    private VIP ingresso;

    public String getLocalizacaoIngresso() {
        return localizacaoIngresso;
    }

    public void setLocalizacaoIngresso(String localizacaoIngresso) {
        this.localizacaoIngresso = localizacaoIngresso;
    }

    public CamaroteSuperior(String localizacaoIngresso, double valor, double adicional) {
        this.localizacaoIngresso = localizacaoIngresso;
        this.ingresso = new VIP(valor, adicional);
    }

    public String imprime() {
        String s = getLocalizacaoIngresso() + " VIP " + ingresso.valorTotal();
        return s;
    }
}
