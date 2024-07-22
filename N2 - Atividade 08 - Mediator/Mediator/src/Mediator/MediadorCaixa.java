package Mediator;
import Models.*;
public interface MediadorCaixa {
    public abstract void criaFilaPoupanca(Caixa p);
    public abstract void criaFilaSaque(Caixa p);
    public abstract void criaFilaCheque(Caixa p);
    public abstract void criaFilaDeposito(Caixa p);
    public abstract void controlaFila (int fila, int senha);
}
