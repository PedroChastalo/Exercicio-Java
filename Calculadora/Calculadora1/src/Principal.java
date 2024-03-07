public class Principal {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double numero1 = 30;
        double numero2 = 5; // defini os valores aqui em cima pra não ter que definir al lado de cada construtor

        System.out.println("");
        System.out.println("Soma: " + calculadora.soma(numero1, numero2));
        System.out.println("");

        System.out.println("Subtração: " + calculadora.subtracao(numero1, numero2));
        System.out.println("");

        System.out.println("Divisão: " + calculadora.divisao(numero1, numero2));
        System.out.println("");

        System.out.println("Multiplicação: " + calculadora.multiplicacao(numero1, numero2));
        System.out.println("");
    }
}
