public class Principal {
    public static void main(String[] args) {

        System.out.println("");

        // cada garçom tem 4 copos
        Copo c1 = new Copo("Pepsi", 5.0, true);
        Copo c2 = new Copo("Suco", 4.0, true);
        Copo c3 = new Copo("Água", 2.0, true);
        Copo c4 = new Copo("Skol", 6.0, true);

        Funcionario g1 = new Funcionario("Wesley", 1, c1, c2, c3,c4 ); // cada garçom ser 1 mesa, 2 garções 2 mesas cm pedido no exercicio

        Copo c5 = new Copo("Coca", 5.0, true);
        Copo c6 = new Copo("Agua", 4.0, false);
        Copo c7 = new Copo("Agua", 2.0, true);
        Copo c8 = new Copo("Fanta", 6.0, true);

        Funcionario g2 = new Funcionario("Roberto", 2, c5, c6, c7, c8);

        System.out.println("");
        System.out.println("Pedido 1:");
        g1.servirPedido();
        System.out.println("");

        System.out.println("Pedido 2:");
        g2.servirPedido();
        System.out.println("");

    }
}