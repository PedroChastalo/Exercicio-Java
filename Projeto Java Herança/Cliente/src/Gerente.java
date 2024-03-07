public class Gerente extends Funcionario {
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Gerente(Integer matricula, double salario, Integer tempoServico, String departamento) {
        super(matricula, salario, tempoServico);
        this.departamento = departamento;
    }

    public void exibirDadosGerente() {
        System.out.println("Departamento: " + departamento);
        super.exibirDadosFuncionario();
    }

    public double bonus() {
        // Bônus é calculado como 10% do salário multiplicado pelo tempo de serviço
        return 0.10 * getSalario() * getTempoServico();
    }

    public double salarioFinal() {
        // Salário final é o salário base mais o bônus
        return getSalario() + bonus();
    }
}
