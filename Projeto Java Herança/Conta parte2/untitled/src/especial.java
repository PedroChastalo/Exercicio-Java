public class especial extends Conta {

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    double limite;
    public especial(String cliente, int numConta, double saldo, double limite) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    public void saqueEspecial(double valor) {
        if (valor <= (getSaldo() + limite)) {
            setSaldo(getSaldo() - valor);
            System.out.println("saque realizado saldo apos o saque: " + getSaldo());
        } else {
            System.out.println("O valor do saque é maior que o limite");
        }
    }

}
