import java.util.*;

public class Main {

    public static void main(String[] args){

    int i;
    ArrayList<String> arr = new ArrayList<String>(); // Criação do objeto arr, do tipo ArrayList
    Scanner scan = new Scanner(System.in); // Criação do objeto scan, para ler entradas do teclado

    System.out.println("Digite 7 strings: ");
    // Loop para adicionar 7 elementos ao ArrayList
    for(i = 0; i < 7; i++){
        arr.add(scan.nextLine());
    }

    System.out.println("ArrayList original: ");
    System.out.println(arr);

    System.out.println("ArrayList ordenado: ");
    // Ordena o ArrayList
    Collections.sort(arr);
    System.out.println(arr);

    System.out.println("Digite o elemento que deseja encontrar: ");
    String s = scan.nextLine();
    // Realiza a busca binária por determinado elemento
    System.out.println("Elemento esta na posição: " + Collections.binarySearch(arr, s));


    System.out.println("ArrayList ao contrario: ");
    // Inverte o ArrayList
    Collections.reverse(arr);
    System.out.println(arr);

    System.out.println("Digite o elemento que deseja substituir: ");
    String t = scan.nextLine();
    System.out.println("Digite o novo elemento: ");
    String u = scan.nextLine();
    // Substitui todas as ocorrências de um elemento dentro do ArrayList
    Collections.replaceAll(arr, t, u);
    System.out.println(arr);

    System.out.println("ArrayList após usar o metodo rotate(): ");
    // Rotaciona a lista conforme a distancia especificada
    Collections.rotate(arr, 4);
    System.out.println(arr);

    // Fecha o fluxo de entrada
    scan.close();
}

}
