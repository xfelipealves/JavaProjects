package models;

public class Ale implements Cerveja{
    @Override
    public void produzir() {
        System.out.println("Cerveja de Ale");
    }
}
