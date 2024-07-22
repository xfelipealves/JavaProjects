import devices.*;
import adapters.*;

public class Main {
    public static void main(String[] args) {
        Voltagem220 voltagem220 = new Voltagem220();
        Voltagem110 voltagem110 = new Voltagem110();

        ArCondicionado arCondicionado = new ArCondicionado(voltagem110);
        System.out.println(arCondicionado.testeLigacao(voltagem110));

        //ArCondicionado arCondicionado1 = new ArCondicionado(voltagem220);

        Conversor220v110 conversor220v110 = new Conversor220v110(voltagem220);
        ArCondicionado arCondicionado2 = new ArCondicionado(conversor220v110);
        System.out.println(arCondicionado2.testeLigacao(conversor220v110));
    }
}