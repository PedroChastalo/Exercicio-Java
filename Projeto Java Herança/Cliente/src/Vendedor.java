public class Vendedor extends Funcionario {
    private String tipoProduto;
    private double valorVenda;

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Vendedor(Integer matricula, double salario, Integer tempoServico, String tipoProduto, double valorVenda) {
        super(matricula, salario, tempoServico);
        this.tipoProduto = tipoProduto;
        this.valorVenda = valorVenda;
    }

    public void exibirDadosVendedor() {
        System.out.println("Tipo de Produto: " + tipoProduto);
        System.out.println("Valor da Venda: " + valorVenda);
        super.exibirDadosFuncionario();
    }

    public double salarioFinal() {
        return getSalario() + (0.20 * valorVenda);
    }
}
