import java.util.*;
public class Exercicio3 {
    public static void main(String[] args) {
        String[] cores = { "preto", "amarelo", "verde", "azul", "branco" };
        List<String> list1 = new LinkedList<>(Arrays.asList(cores));
         System.out.println("Lista 1:");
        printList(list1);
        String[] cores2 = {"dourado", "prata", "marron", "cinza"};
        List<String> list2 = new LinkedList<>(Arrays.asList(cores2));
         System.out.println("Lista 2:");
        printList(list2);
 // Continue a implementação. . .

        list2.addAll(list1);
        System.out.println("Após concatenar as listas:");
        printList(list2);

    
 }

 public static void printList(List<String> l){
        for(String s: l){
            System.out.println(s);
        }
    }
}