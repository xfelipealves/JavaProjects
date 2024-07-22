package Facade;
import models.*;
public class Lagers {
    private Lager lager;
    private Munich munich;
    private Vienna vienna;

    public Lagers() {
        this.lager  = new Lager();
        this.munich = new Munich();
        this.vienna = new Vienna();
    }
    public void produzirLager(){
        System.out.println("Cerveja Tipo -> Lager");
        lager.produzir();
    }
    public void produzirMunich(){
        System.out.println("Cerveja Tipo -> Lager");
        munich.produzir();
    }
    public void produzirVienna(){
        System.out.println("Cerveja Tipo -> Lager");
        vienna.produzir();
    }
}
