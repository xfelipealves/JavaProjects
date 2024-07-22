import Interface.Produto;
import models.*;
import FactoryMethod.*;
import Interface.*;

public class Main {
    public static void main(String[] args) {
        //Salgados
        Produto esfirra = FactorySalgados.produzirSalgado("ESFIRRA");
        Produto quibe = FactorySalgados.produzirSalgado("QUIBE");
        Produto coxinha = FactorySalgados.produzirSalgado("COXINHA");
        //Doces
        Produto brigadeiro = FactoryDoces.produzirDoce("BRIGADEIRO");
        Produto bolo = FactoryDoces.produzirDoce("BOLO");
        Produto sorvete = FactoryDoces.produzirDoce("SORVETE");

        CaixaCafeManha caixa1 = new CaixaCafeManha("Caixa de Salgados", "Salgados");
        CaixaCafeManha caixa2 = new CaixaCafeManha("Caixa de Doces", "Doces");
        CaixaCafeManha caixa3 = new CaixaCafeManha("Caixa Mista", "Mista");
        CaixaCafeManha caixa4 = new CaixaCafeManha("Caixa Mista", "Mista");

        caixa1.adiciona(esfirra);
        caixa1.adiciona(quibe);
        caixa1.adiciona(coxinha);
        caixa1.listar();
        System.out.println("\n");

        caixa2.adiciona(brigadeiro);
        caixa2.adiciona(bolo);
        caixa2.adiciona(sorvete);
        caixa2.listar();
        System.out.println("\n");

        caixa3.adiciona(esfirra);
        caixa3.adiciona(coxinha);
        caixa3.adiciona(bolo);
        caixa3.adiciona(caixa2); //AGREGADO DO COMPOSITE, CAIXA DENTRO DE CAIXA
        caixa3.listar();
        System.out.println("\n");

        caixa4.adiciona(esfirra);
        caixa4.adiciona(brigadeiro);
        caixa4.adiciona(sorvete);
        caixa4.listar();
    }
}