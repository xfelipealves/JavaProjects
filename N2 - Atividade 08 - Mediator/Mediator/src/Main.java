import Mediator.*;
import Models.*;
public class Main {
    public static void main(String[] args) {
        MediadorCaixaImp agencia = new MediadorCaixaImp();

        Caixa poupanca = new Poupanca();
        Caixa saque = new Saque();
        Caixa cheque = new Cheque();
        Caixa deposito = new Deposito();

        agencia.criaFilaPoupanca(poupanca);
        agencia.criaFilaSaque(saque);
        agencia.criaFilaCheque(cheque);
        agencia.criaFilaDeposito(deposito);

        // Gerador de senhas sequenciais
        int senhaAtual = 1;

        // Redireciona as senhas para as filas
        agencia.controlaFila(1, senhaAtual++); // Poupança
        agencia.controlaFila(2, senhaAtual++); // Saque
        agencia.controlaFila(3, senhaAtual++); // Cheque
        agencia.controlaFila(4, senhaAtual++); // Depósito
        agencia.controlaFila(1, senhaAtual++); // Poupança
        agencia.controlaFila(2, senhaAtual++); // Saque
        agencia.controlaFila(3, senhaAtual++); // Cheque

        // Chama as senhas uma por uma e imprime a fila correspondente
        poupanca.listaFila();
        saque.listaFila();
        cheque.listaFila();
        deposito.listaFila();

        poupanca.atender();
        saque.atender();
        cheque.atender();
        deposito.atender();

        poupanca.listaFila();
        saque.listaFila();
        cheque.listaFila();
        deposito.listaFila();
    }
}