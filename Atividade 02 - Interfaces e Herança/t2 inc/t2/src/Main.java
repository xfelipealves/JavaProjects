import ex1.Caneta;
import ex1.Esferografica;
import ex1.Giz;
import ex1.Lapis;
import ex2.Entrega;
import ex2.Encomenda;
import ex2.Revista;
import ex2.Pacote;
import ex2.Carta;
import ex3.FormaGeometrica;
import ex3.Circulo;
import ex3.Quadrado;

import java.text.Normalizer;

public class Main {
    public static void escreverTexto(Caneta c, String texto){
        c.escrever(texto);
        System.out.println("Cor = " + c.getCor());
    }

    public static void entregas(Entrega e){
        System.out.println(e.getIdentificador());
        System.out.println(e.getCidadeOrigem());
        System.out.println(e.getCidadeDestino());

        String s = e instanceof Carta ? ((Carta) e).getTexto() :
                e instanceof Pacote ? ((Pacote) e).getDescricao() + ' ' + ((Pacote) e).getPeso() :
                e instanceof Revista ? ((Revista) e).getTitulo() + ' ' + ((Revista) e).getMes() : null;
        System.out.println(s);
    }

    public static void calculo(FormaGeometrica FG){
        System.out.println(FG.area());
        System.out.println(FG.comprimento());

        String s = FG instanceof Quadrado ? Double.toString(((Quadrado) FG).getLado()) :
                FG instanceof Circulo ? Double.toString(((Circulo) FG).getRaio()) : null;
        System.out.println(s);
    }
    public static void main(String[] args) {

        //Ex1--------------------------------------------

        Caneta c1 = new Esferografica("azul");
        Caneta c2 = new Giz("verde");
        Caneta c3 = new Lapis("preto");

        escreverTexto(c1, "Teste de Escrita");
        escreverTexto(c2, "Teste de Escrita");
        escreverTexto(c3, "Teste de Escrita");

        //Ex2--------------------------------------------
        Revista rev = new Revista("1001", "Goiania",
                "Sao Paulo", "Veja", 5);
        Carta car = new Carta("1002", "Recife", "Alagoas",
                "Presente do Papai Noel");
        Pacote pac = new Pacote("1003", "Rio de Janeiro", "Porto Alegre",
                200.0, "Talheres de inox");

        entregas(rev);
        entregas(car);
        entregas(pac);

        //Ex3--------------------------------------------
        FormaGeometrica quad = new Quadrado(4);
        FormaGeometrica circ = new Circulo(3.5);

        calculo(quad);
        calculo(circ);

        //Ex4--------------------------------------------

    }
}