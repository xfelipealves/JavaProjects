import Model.*;
public class Main {
    public static void main(String[] args) {
        Pilotos piloto1 = new Pilotos("Japa", Pista.getInstancePista());
        System.out.println(piloto1);
        Pilotos piloto2 = new Pilotos("Goku", Pista.getInstancePista());
        System.out.println(piloto2);
        Pilotos piloto3 = new Pilotos("Jaspion", Pista.getInstancePista());
        System.out.println(piloto3);
    }
}