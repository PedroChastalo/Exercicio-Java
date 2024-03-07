    public class Principal {
        public static void main(String[] args) {


            ClienteVip cV = new ClienteVip("Cliente VIP", 30, "Feminino", 5000, 1000.0, 200.0);

            System.out.println("");
            System.out.println("Cliente vip: ");
            cV.exibirDadosClienteVip();
            System.out.println("");
            double valorParcela = cV.parcelar(cV.getValorDivida(), 5);
            System.out.println("Valor parcela: " + valorParcela);
            System.out.println("");

            Gerente gerente = new Gerente(101, 8000.0, 5, "Vendas");
            System.out.println("");
            System.out.println("Gerente: ");
            System.out.println("");
            gerente.exibirDadosGerente();
            System.out.println("");
            double bonus = gerente.bonus();
            System.out.println("bonus Gerente: " + bonus);
            System.out.println("");
            double salarioFinalGerente = gerente.salarioFinal();
            System.out.println("");
            System.out.println("Salário final: " + salarioFinalGerente);
            System.out.println("");

            System.out.println("Vendedor: ");
            Vendedor vendedor = new Vendedor(201, 3000.0, 2, "eletronico", 2000);
            System.out.println("");
            vendedor.exibirDadosVendedor();
            System.out.println("");
            double salarioFinalVendedor = vendedor.salarioFinal();
            System.out.println("Salário Final do Vendedor: " + salarioFinalVendedor);

            Funcionario funcionario = new Funcionario(301, 4000.0, 3);
            System.out.println("Funcionario: ");
            System.out.println("");
            funcionario.exibirDadosFuncionario();
        }
    }
