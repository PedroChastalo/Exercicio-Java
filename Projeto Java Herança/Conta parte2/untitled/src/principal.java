public class principal {
    public static void main(String[] args) {

        Conta cc1 = new Conta("cliente 1", 1, 1500);

        System.out.println("");
        cc1.exibirSaldo();
        System.out.println("");

        cc1.sacar(500);
        System.out.println("");

        cc1.exibirSaldo();
        System.out.println("");

        cc1.depositar(1000);
        System.out.println("");

        cc1.exibirSaldo();
        System.out.println("");


        poupanca pc2 = new poupanca("Cliente 2", 2, 1500.0, 45);

        System.out.println("Conta poupança: ");

        System.out.println("");
        pc2.exibirSaldo();

        System.out.println("");
        pc2.calcularNovoSaldo(0.5);
        System.out.println("");


        especial ec3 = new especial("Cliente 3", 3, 2000.0, 1000);
        System.out.println("Conta especial: ");

        System.out.println("");
        ec3.exibirSaldo();
        System.out.println("");

        ec3.saqueEspecial(1500);
        System.out.println("");

        ec3.exibirSaldo();
        System.out.println("");

        ec3.depositar(1500);
        System.out.println("");

        ec3.saqueEspecial(3000);
        System.out.println("");

        ec3.exibirSaldo();
        System.out.println("");

        // depois de treinar com as outras eu fiz essa daqui em 10 min, ja entendi a sintaxe e a logica, estou conseguindo fazer muito mais rapido que antes

    }
}
