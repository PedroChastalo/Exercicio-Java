public class Funcionario {
    private Integer matricula;
    private double salario;
    private Integer tempoServico;

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Integer getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(Integer tempoServico) {
        this.tempoServico = tempoServico;
    }

    public Funcionario(Integer matricula, double salario, Integer tempoServico) {
        this.matricula = matricula;
        this.salario = salario;
        this.tempoServico = tempoServico;
    }

    public void exibirDadosFuncionario() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário: " + salario);
        System.out.println("Tempo de Serviço: " + tempoServico + " anos");
    }
}