import Model.*;
import FactoryMethod.*;

import java.util.Scanner;

public class Main {
    public static void imprimeRefri(Refrigerante r){
        System.out.println(r.propaganda());
    }
    public static void main(String[] args) {
        System.out.println("Escolha COCACOLA, PEPSI ou REFRIGERANTE: ");
        Scanner sc = new Scanner(System.in);
        String marca = sc.next();

        System.out.println("Qual tipo?");
        String tipo = sc.next();
        System.out.println("Qual volume?");
        int volume = sc.nextInt();
        System.out.println("Qual preco?");
        double preco = sc.nextDouble();

        String promocao = "";
        String brinde = "";

        if (marca.equals("PEPSI")) {
            System.out.println("Qual promocao?");
            promocao = sc.next();
        }
        if (marca.equals("GUARANA")) {
            System.out.println("Qual brinde?");
            brinde = sc.next();
        }

        Refrigerante refri = FactoryMethodRefrigerante.produzirFolder(marca, tipo, volume, preco, promocao, brinde);
        imprimeRefri(refri);

    }
}