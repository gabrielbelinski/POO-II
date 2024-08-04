public class Pessoa implements Runnable{

    Thread thread;
    ContaBancaria conta;

    public Pessoa(ContaBancaria c){
        thread = new Thread(this);
        conta = c;
        thread.start();
    }

    public void run(){
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(300);
                    System.out.println("Sacando R$ 200.00");
                    conta.sacar(200.00);
                    System.out.println("Depositando R$ 200.00");
                    conta.depositar(200.00);
                    System.out.println("Saldo: R$ " + conta.getSaldo());
                }
                catch (InterruptedException exc){
                    System.err.println("Thread interrompida...");
                }
            }
    }
}
