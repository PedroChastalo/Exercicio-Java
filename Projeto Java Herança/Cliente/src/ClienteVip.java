public class ClienteVip extends Cliente {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public ClienteVip(String nome, Integer idade, String sexo, double renda, double valorDivida, double bonus) {
        super(nome, idade, sexo, renda, valorDivida);
        this.bonus = bonus;
    }

    public void exibirDadosClienteVip() {
        super.exibirDadosCliente();
        System.out.println("Bônus: " + bonus);
    }

    public double parcelar(double valorDivida, int numVezes) {
        // Implemente o cálculo do valor da parcela aqui
        return valorDivida / numVezes;
    }
}