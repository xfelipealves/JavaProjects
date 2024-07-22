import Model.*;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Pneu carro
        Pneu pneuCarro = new Pneu("Firestone", 16);
        Pneu pneu2 = (Pneu) pneuCarro.clone();
        Pneu pneu3 = (Pneu) pneuCarro.clone();
        Pneu pneu4 = (Pneu) pneuCarro.clone();

        // criar carro
        Carro carro = new Carro();
        carro.pneus.add(pneuCarro);
        carro.pneus.add(pneu2);
        carro.pneus.add(pneu3);
        carro.pneus.add(pneu4);

        //Pneu Caminhao
        Pneu pneuCaminhao = new Pneu("Michelin", 30);
        Pneu pneuC2 = (Pneu) pneuCaminhao.clone();
        Pneu pneuC3 = (Pneu) pneuCaminhao.clone();
        Pneu pneuC4 = (Pneu) pneuCaminhao.clone();
        Pneu pneuC5 = (Pneu) pneuCaminhao.clone();
        Pneu pneuC6 = (Pneu) pneuCaminhao.clone();

        // criar Caminhao
        Caminhao caminhao = new Caminhao();
        caminhao.pneus.add(pneuCaminhao);
        caminhao.pneus.add(pneuC2);
        caminhao.pneus.add(pneuC3);
        caminhao.pneus.add(pneuC4);
        caminhao.pneus.add(pneuC5);
        caminhao.pneus.add(pneuC6);

        // imprime
        System.out.println(carro);
        System.out.println(caminhao);
    }
}