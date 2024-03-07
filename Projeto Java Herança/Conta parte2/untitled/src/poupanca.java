public class poupanca extends Conta {


    public int getDiasRendimento() {
        return diasRendimento;
    }

    public void setDiasRendimento(int diasRendimento) {
        this.diasRendimento = diasRendimento;
    }

    int diasRendimento;

    public poupanca(String cliente, int numConta, double saldo, int diasRendimento) {
        super(cliente, numConta, saldo);

        this.diasRendimento = diasRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento){

        double valorRendido = taxaRendimento * diasRendimento;

        setSaldo(valorRendido + getSaldo());
        System.out.println("O valor rendido em " + diasRendimento + " dias foi de " + valorRendido);
        System.out.println("Seu novo saldo é " + getSaldo());
    }


}
