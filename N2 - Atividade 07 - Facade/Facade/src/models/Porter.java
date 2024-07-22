package models;

public class Porter implements Cerveja{
    @Override
    public void produzir() {
        System.out.println("Cerveja de Porter");
    }
}
