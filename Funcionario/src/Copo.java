public class Copo {
    private String tipoBebida;
    private double valor;
    private boolean cheio;

    public Copo(String tipoBebida, double valor, boolean cheio) {
        this.tipoBebida = tipoBebida;
        this.valor = valor;
        this.cheio = cheio;
    }

    public boolean verificarCheio() {
        return cheio;
    }

    public double Valor() {
        return valor;
    }


}