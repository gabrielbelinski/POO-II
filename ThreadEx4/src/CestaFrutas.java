import java.util.*;
public class CestaFrutas implements Runnable {

    private String nomeThread;

    public CestaFrutas(String nome){
        this.nomeThread = nome;
    }

    @java.lang.Override
    public void run() {
        List<String> frutas = new ArrayList<>();
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.add("Figo");
        frutas.add("Laranja");
        System.out.println(this.nomeThread + " iniciando");

        try{
            for(int i = 0; i < 4; i++){
                Thread.sleep(400);
                System.out.println(frutas.get(i));
            }
        }
        catch (InterruptedException exc){
            System.err.println(this.nomeThread + " interrompida.");
        }
        System.out.println(this.nomeThread + " terminando.");
    }
}
