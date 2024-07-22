import builder.*;
import director.*;
import model.*;

public class main {

    public static void order(String name, CarroBuilder builder) {
        System.out.println("Ordering a " + name);
        CarroDirector director = new CarroDirector(builder);
        director.constructCarro();
        System.out.println(director.getCarro());

        System.out.println("-------------------------");
    }

    public static void main(String[] args){
        order("Palio", new CarroPopularBuilder());
        order("Civic", new CarroImportadoBuilder());
        order("Jaguar", new CarroEsportivoBuilder());
    }
}
