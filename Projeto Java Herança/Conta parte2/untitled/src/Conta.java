public class Conta {

    private String cliente;

    private int numConta;
    private double saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(String cliente, int numConta, double saldo){
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(int valor){
        if (saldo > valor){
            System.out.println("Valor do saque " + valor);
            saldo = saldo - valor;
        } else {
            System.out.println("Saque não concluido pois não a saldo suficinte");
        }
    }
    public void depositar(int valor){
        saldo = valor + saldo;
        System.out.println("Deposito de " + valor + " Concluido");
    }

    public void exibirSaldo(){
        System.out.println("Seu saldo atual é " + saldo + "reais");
    }
}
