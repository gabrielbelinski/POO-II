public class UsaConta {

    public static void main(String[] args){
        ContaBancaria c1 = new ContaBancaria();
        Pessoa p1 = new Pessoa(c1);
        Pessoa p2 = new Pessoa(c1);

        try{
            p1.thread.join();
            p2.thread.join();
        }
        catch(InterruptedException ex){
            System.err.println("Thread principal interrompida.");
        }
        System.out.println("Valor final do saldo = R$ " + c1.getSaldo());
    }

}