public class Cliente extends Pessoa {
    private double renda;
    private double valorDivida;

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public Cliente(String nome, Integer idade, String sexo, double renda, double valorDivida) {
        super(nome, idade, sexo);
        this.renda = renda;
        this.valorDivida = valorDivida;
    }

    public void exibirDadosCliente() {
        super.exibirDadosPessoa();
        System.out.println("Renda: " + renda);
        System.out.println("Valor da Dívida: " + valorDivida);
    }
}