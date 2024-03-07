public class Conta {
    private double saldo;
    private String tipo;

    public Conta(double valorInicial) {
        saldo = valorInicial;
        tipo = "Poupanca"; //a conta inicial e poupança, como dito no exercicio
    }

    public Conta(double valorInicial, String tipo) {
        saldo = valorInicial;
        this.tipo = tipo;
    }


    public boolean depositar(double valor) {
        if (tipo.equals("Corrente") && valor > 5000) {
            return false; //respeitando a regra que o professor falou no exercicio
        }
        saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta contaDestino) {
        if (tipo.equals("Corrente")) {
            return false;
        }
        if (valor <= saldo) {
            saldo -= valor;
            contaDestino.saldo += valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }
}
