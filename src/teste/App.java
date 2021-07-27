package teste;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import classes.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Exercício 1
        System.out.println("<<---------->>\n");

        Stack<String> principal = new Stack<>();
        Stack<String> destino = new Stack<>();
        Stack<String> auxiliar = new Stack<>();

        principal.push("A");
        principal.push("B");
        principal.push("C");

        TorreHanoi.torre(principal.size(), principal, destino, auxiliar);

        // Exercício 2
        System.out.println("<<---------->>\n");

        Queue<Cliente> filaComPrioridade = new PriorityQueue<Cliente>(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente p1, Cliente p2) {
                return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
            }

        });

        filaComPrioridade.offer(new Cliente("Caixa Máximo de 15 itens", 3));
        filaComPrioridade.offer(new Cliente("Idoso", 1));
        filaComPrioridade.offer(new Cliente("Demais clientes", 4));
        filaComPrioridade.offer(new Cliente("Gestante", 2));
        filaComPrioridade.offer(new Cliente("Caixa Máximo de 15 itens", 3));
        filaComPrioridade.offer(new Cliente("Gestante", 2));
        filaComPrioridade.offer(new Cliente("Caixa Máximo de 15 itens", 3));
        filaComPrioridade.offer(new Cliente("Demais clientes", 4));
        filaComPrioridade.offer(new Cliente("Idoso", 1));

        while (!filaComPrioridade.isEmpty()) {
            System.out.println(filaComPrioridade.poll());
        }

        // Exercício 3
        System.out.println("<<---------->> \n");

        System.out.println("Pré-ordem: 55, 3, 6, 9, 13, 23, 4, 8, 15, 11, 02, 65");
        System.out.println("Em-ordem: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13");
        System.out.println("Pós-ordem: 1, 3, 2, 5, 6, 4, 11, 10, 13, 15, 14, 12");

    }

}