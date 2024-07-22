package Factory;

import Model.*;

import java.util.Scanner;

public abstract class FactoryRefrigerante {
    protected static double valor = 0;
    public static Refrigerante venda(double valor) {
        FactoryRefrigerante.valor += valor;

        if (FactoryRefrigerante.valor < 5) {
            System.out.println("\nFaltam " + (5-valor) + " reais\n");
        } else if (FactoryRefrigerante.valor > 5) {
            FactoryRefrigerante.valor = 0;
        } else { //igual
            System.out.println("\nQual refrigerante quer? 1 pra guardana e 2 pra coca: ");
            Scanner sc = new Scanner(System.in);
            int entrada = sc.nextInt();

            FactoryRefrigerante factory = entrada == 1 ? new FactoryGuarana() : new FactoryCocaCola();

            return factory.criaRefrigerante();
        }
        return null;
    }

    public abstract Refrigerante criaRefrigerante();
}
