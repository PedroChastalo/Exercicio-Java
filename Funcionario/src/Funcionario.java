public class Funcionario {
    private String nome;
    private int numMesa;
    private double valorTotal;
    private Copo cp1;
    private Copo cp2;
    private Copo cp3;
    private Copo cp4;

    public Funcionario(String nome, int numMesa, Copo cp1, Copo cp2, Copo cp3, Copo cp4) {
        this.nome = nome;
        this.numMesa = numMesa;
        this.cp1 = cp1;
        this.cp2 = cp2;
        this.cp3 = cp3;
        this.cp4 = cp4;
    }

    public boolean verificarCopos() {
        return cp1.verificarCheio() && cp2.verificarCheio() && cp3.verificarCheio() && cp4.verificarCheio();
    }

    public double calcularValor() {
        return cp1.Valor() + cp2.Valor() + cp3.Valor() + cp4.Valor();
    }

    public void servirPedido() {
        if (verificarCopos()) {
            System.out.println("nome do garçom: " + nome);
            System.out.println("Número da Mesa: " + numMesa);
            System.out.println("Valor: " + calcularValor());

        } else {
            System.out.println("Pedido não realizado. Algum copo não esta cheio");
        }
    }
}