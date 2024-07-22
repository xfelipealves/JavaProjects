package models;

public class Munich implements Cerveja{
    @Override
    public void produzir() {
        System.out.println("Cerveja de Munich");
    }
}