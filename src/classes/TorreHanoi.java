package classes;  
import java.util.Stack;

public class TorreHanoi {

    public static void torre (int n, Stack<String> principal, Stack<String> destino, Stack<String> auxiliar){
        if (n > 0){
            torre(n-1, principal, auxiliar, destino);
            destino.push(principal.pop());
            System.out.println("");
            System.out.print("Torre: " + principal);
            System.out.print("  Torre: " + destino);
            System.out.print("  Torre: " + auxiliar);
            torre(n-1, auxiliar, destino, principal);
        }
    }    
}