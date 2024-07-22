package ex2;

public class CamaroteInferior {
    private String localizacaoIngresso;
    private Normal ingresso;

    public String getLocalizacaoIngresso() {
        return localizacaoIngresso;
    }

    public void setLocalizacaoIngresso(String localizacaoIngresso) {
        this.localizacaoIngresso = localizacaoIngresso;
    }

    public CamaroteInferior(String localizacaoIngresso, double valor) {
        this.localizacaoIngresso = localizacaoIngresso;
        this.ingresso = new Normal(valor);
    }

    public String imprime() {
        String s = getLocalizacaoIngresso() + " " + ingresso.imprime() + " " + ingresso.imprimeValor();
        return s;
    }
}
