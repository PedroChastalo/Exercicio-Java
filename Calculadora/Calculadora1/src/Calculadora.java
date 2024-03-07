public class Calculadora {
    public double soma(double numero1, double numero2) {
        System.out.println(numero1 +" + "+ numero2);
        return numero2 + numero1;
    }
    public double subtracao(double numero1, double numero2) {
        System.out.println(numero1 +" - "+ numero2);
        return numero1 - numero2;
    }
    public double divisao(double numero1, double numero2) {
        if (numero2 == 0) {
            System.out.println("Não é possível dividir por zero.");
        }
        System.out.println(numero1 + " / " + numero2);
        return numero1 / numero2;
    }
    public double multiplicacao(double numero1, double numero2) {
        System.out.println(numero1 + " x " + numero2);
        return numero1 * numero2;
    }
}

