import Interface.*;
import Models.*;
public class Main {
    public static void main(String[] args) {
        //Frutas
        Produto p1 = new Fruta("Pera", 5.55);
        Produto p2 = new Fruta("Banana", 6.7);
        //Verduras
        Produto p3 = new Verdura("Alface", 7.0);
        Produto p4 = new Verdura("Cenoura", 9.0);

        //Composite 1
        Xepa caixa1 = new Xepa("Caixa de Frutas");
        caixa1.adiciona(p1);
        caixa1.adiciona(p2);
        caixa1.imprimir();

        //Composite 2
        Xepa caixa2 = new Xepa("Caixa de Verduras");
        caixa2.adiciona(p3);
        caixa2.adiciona(p4);
        caixa2.imprimir();

        //Composite 3
        Xepa caixa3 = new Xepa("Caixa Mista");
        caixa3.adiciona(p1);
        caixa3.adiciona(p2);
        caixa3.adiciona(p3);
        caixa3.adiciona(p4);
        caixa3.adiciona(caixa1);
        caixa3.imprimir();
    }
}