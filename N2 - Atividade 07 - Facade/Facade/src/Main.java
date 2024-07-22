import Facade.*;
public class Main {
    public static void main(String[] args) {
        Ales  ales   = new Ales();
        ales.produzirAle();
        ales.produzirPorter();
        ales.produzirStout();
        ales.produzirTrigo();

        Lagers lagers = new Lagers();
        lagers.produzirLager();
        lagers.produzirMunich();
        lagers.produzirVienna();
    }
}