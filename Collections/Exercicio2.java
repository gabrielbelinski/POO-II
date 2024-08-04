import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {
        String[] cores = {"vermelho", "branco", "azul", "verde", "cinza", "laranja", "laranja", "cinza","vermelho"};
        List<String> list = new ArrayList<>(Arrays.asList(cores));
        printCollection("ArrayList", list);

        Set<String> hashSet = new HashSet<>(list);
        printCollection("HashSet", hashSet);

        Set<String> treeSet = new TreeSet<>(list);
        printCollection("TreeSet", treeSet);
    }

    public static void printCollection(String type, Collection<String> collection) {
        System.out.println(type + ":");
        for (String color : collection) {
            System.out.println(color);
        }
    }
}
