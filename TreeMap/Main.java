import java.util.*;

public class Main {

    public static void main(String[] args){
        TreeMap<String, Double> pontos = new TreeMap<String, Double>();

        pontos.put("Gabriel", 1000.00);
        pontos.put("Belinski", 2000.00);
        pontos.put("Salomao", 3000.00);
        pontos.put("Oto", 4000.00);
        pontos.put("Dora", 3500.00);

        Set<Map.Entry<String, Double>> set = pontos.entrySet();

        for(Map.Entry<String, Double> a : set){
            System.out.println("Nome do jogador: " + a.getKey() + " | " + "Pontuação: " + a.getValue());
        }
    }
    
}
