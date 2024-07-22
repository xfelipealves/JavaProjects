package Facade;
import models.*;

public class Ales {
    private Ale ale;
    private Porter porter;
    private Stout stout;
    private Trigo trigo;

    public Ales() {
        this.ale = new Ale();
        this.porter = new Porter();
        this.stout = new Stout();
        this.trigo = new Trigo();
    }
    public void produzirAle(){
        System.out.println("Cerveja Tipo -> Ale");
        ale.produzir();
    }
    public void produzirPorter(){
        System.out.println("Cerveja Tipo -> Ale");
        porter.produzir();
    }
    public void produzirStout(){
        System.out.println("Cerveja Tipo -> Ale");
        stout.produzir();
    }
    public void produzirTrigo(){
        System.out.println("Cerveja Tipo -> Ale");
        trigo.produzir();
    }
}
