import model.*;
import Decorator.*;

public class Main {
    public static void main(String[] args) {

        Chocolate chocolate1 = new Tablete();
        System.out.println(chocolate1.getDescricao());

        Chocolate chocolate2 = new Bombom();
        System.out.println(chocolate2.getDescricao());

        chocolate2 = new Branco(chocolate2);
        System.out.println(chocolate2.getDescricao());

        Chocolate chocolate4 = new MeioAmargo(new AoLeite(new Pastilha()));
        System.out.println(chocolate4.getDescricao());

        chocolate4 = new Branco(chocolate4);
        System.out.println(chocolate4.getDescricao());
    }
}