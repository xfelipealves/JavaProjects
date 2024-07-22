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
import ex4.Controle;
import ex4.Aparelho;
import ex4.TV;
import ex4.Radio;
import org.w3c.dom.ls.LSOutput;
import java.text.Normalizer;
import java.util.Scanner;
import ex5.Voador;
import ex5.Mamifero;
import ex5.Passaro;
import ex5.Morcego;
import ex5.Cachorro;

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

    public static void LigaDesliga(Controle t) {
        System.out.println(((Aparelho) t).getStatus());
    }

    public static void ControlaVolume(Controle t) {
        System.out.println("1 - Tv ou 2- Radio?");
        Scanner sc2 = new Scanner(System.in);
        int op1 = sc2.nextInt();

        System.out.println("Qual volume? 1 a 10");
        int op2 = sc2.nextInt();

        if (op1 == 1) {
            t = new TV();
            t.setVolume(op2);
        } else if (op1 == 2){
            t = new Radio();
            t.setVolume(op2);
        }
    }

    public static void Canal(Controle t) {
        System.out.println("Qual canal vc quer colocar?");
        Scanner sc1 = new Scanner(System.in);
        int op1 = sc1.nextInt();

        ((TV) t).setCanal(op1);
    }

    public static void Faixa(Controle t) {
        System.out.println("Qual faixa vc quer colocar?");
        Scanner sc1 = new Scanner(System.in);
        int op1 = sc1.nextInt();

        ((Radio) t).setFaixa(op1);
    }

    public static void ImprimeTV(Controle t) {
        TV a = (TV) t;
        System.out.println(a.getStatus() + " " + a.getCanal() + ' ' + a.getVolume());
    }
    public static void ImprimeRadio(Controle t) {
        Radio a = (Radio) t;
        System.out.println(a.getStatus() + " " + a.getFaixa() + ' ' + a.getVolume());
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
        int op = 10;
        Aparelho Toshiba = new TV();
        Aparelho Pioneer = new Radio();
        while (op != 0) {
            System.out.println("------Escolha a opçao--------");
            System.out.println("- 1-Liga/Desliga            -");
            System.out.println("- 2-Controla Volume         -");
            System.out.println("- 3- TV-Seleciona Canal     -");
            System.out.println("- 4- Radio: Seleciona faixa -");
            System.out.println("- 5- Informacoes TV         -");
            System.out.println("- 6- Informacoes Radio      -");
            System.out.println("- 0- Sair                   -");
            System.out.println("-----------------------------");
            System.out.println("Opçao: ");

            if (op == 1) {
                LigaDesliga(Toshiba);
            } else {
                if (op == 2) {
                    ControlaVolume(new TV());
                } else {
                    if (op == 3) {
                        Canal(Toshiba);
                    } else {
                        if (op == 4) {
                            Faixa(Pioneer);
                        } else {
                            if (op == 5) {
                                ImprimeTV(Toshiba);
                            } else {
                                if (op == 6) {
                                    ImprimeRadio(Pioneer);
                                }
                            }
                        }
                    }
                }
            }
            Scanner sc1 = new Scanner(System.in);
            op = sc1.nextInt();

            sc1.close();
        }
        //Ex5--------------------------
        Cachorro cao = new Cachorro("Akita");
        Morcego mor = new Morcego();
        Passaro pas = new Passaro("Papagaio");

        System.out.println(cao.getRaca());
        System.out.println(pas.getEspecie());
    }
}