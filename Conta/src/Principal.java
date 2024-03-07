public class Principal {
    public static void main(String[] args) {
        Conta contaPoupanca = new Conta(1000);
        Conta contaCorrente = new Conta(2000, "Corrente");

        System.out.println();//pra pula linha
        System.out.println("Saldo da conta Poupança: " + contaPoupanca.getSaldo());

        System.out.println("Saldo da conta Corrente: " + contaCorrente.getSaldo());
        System.out.println();


        System.out.println("Realizando Deposito conta poupança");
        int depositoP = 1300;
        int depositoC = 2500;
        contaPoupanca.depositar(depositoP);
        contaCorrente.depositar(depositoC);

        System.out.println("Valor que sera depositado: " + depositoP);
        System.out.println("Novo saldo da conta Poupança: " + contaPoupanca.getSaldo());
        System.out.println();

        System.out.println("Realizando Deposito conta corrente");
        System.out.println("Valor que sera depositado: " + depositoC);
        System.out.println("Novo saldo da conta Corrente: " + contaCorrente.getSaldo());
        System.out.println();


        System.out.println("Realizando saque da conta poupança");
        int sacarP = 750;
        int sacarC = 1250;
        contaPoupanca.sacar(sacarP);
        contaCorrente.sacar(sacarC);

        System.out.println("Valor a ser sacado: " + sacarP);
        System.out.println("Saldo depois de saques da conta Poupança: " + contaPoupanca.getSaldo());
        System.out.println();

        System.out.println("Realizando saque da conta corrente");
        System.out.println("valor a ser sacado: " + sacarC);
        System.out.println("Saldo depois de saques da conta Corrente: " + contaCorrente.getSaldo());
        System.out.println();


        System.out.println("Realizando transferencia de contas poupança");
        int saldoOutraConta = 1250;
        Conta outraContaPoupanca = new Conta(saldoOutraConta);

        int valorTransferirP = 200;
        contaPoupanca.transferir(valorTransferirP, outraContaPoupanca);
        System.out.println("Valor a ser transferido: " + valorTransferirP);
        System.out.println("Saldo após transferência entre contas: " + contaPoupanca.getSaldo());
        System.out.println("Saldo da outra conta depois da transferência: " + outraContaPoupanca.getSaldo());
        System.out.println();

        System.out.println("Realizando transferencia de contas corrente");
        int valorTranferirC = 1000;
        contaCorrente.transferir(valorTranferirC, outraContaPoupanca);
        System.out.println("Valor a ser transferido: " + valorTranferirC);
        System.out.println("Saldo da conta após transferência: " + contaCorrente.getSaldo());
        System.out.println("Saldo da outra conta após transferência: " + outraContaPoupanca.getSaldo());
    }
}
