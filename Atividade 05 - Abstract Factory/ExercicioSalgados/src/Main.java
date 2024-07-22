import Models.*;
import Factories.*;
public class Main {
    public static void main(String[] args) {

        SalgadosFactory facbrica1 = new SalgadosFactory("coxinha", "goias");
        SalgadosFactory facbrica2 = new SalgadosFactory("coxinha", "ceara");
        SalgadosFactory facbrica3 = new SalgadosFactory("empada", "goias");
        SalgadosFactory facbrica4 = new SalgadosFactory("empada", "ceara");

        facbrica1.assarSalgado();
        facbrica2.assarSalgado();
        facbrica3.assarSalgado();
        facbrica4.assarSalgado();

        System.out.println("Coxinha do Goias");
        System.out.println(facbrica1);

        System.out.println("Coxinha do Ceara");
        System.out.println(facbrica2);

        System.out.println("Empada do Goias");
        System.out.println(facbrica3);

        System.out.println("Empada do Ceara");
        System.out.println(facbrica4);
    }
}