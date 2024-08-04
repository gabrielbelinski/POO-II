public class ContaBancaria {
    private double saldo;

    public ContaBancaria(){
        this.saldo = 1000.00;
    }

    public synchronized void sacar(double valor){
        this.saldo -= valor;
    }

    public synchronized void depositar(double valor){
        this.saldo += valor;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
