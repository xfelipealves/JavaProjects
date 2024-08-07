package Models;

import java.util.LinkedList;
import java.util.Queue;

public class Saque implements Caixa{
    protected Queue<Integer> fila = new LinkedList<>();
    @Override
    public void listaFila() {
        System.out.println("Fila de Saque: " + fila);
    }

    @Override
    public void redirecionar(int senha) {
        fila.add(senha);
    }

    @Override
    public void atender() {
        if (fila.isEmpty()) {
            System.out.println("Fila de Saque está vazia");
        } else {
            System.out.println("Atendendo cliente da fila de Saque, senha: " + fila.poll());
        }
    }
}
