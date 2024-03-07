public class Principal {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5.0);
        System.out.println("Círculo: Área = " + circulo.area() + ", Perímetro = " + circulo.perimetro());

        Retangulo retangulo = new Retangulo(4.0, 3.0);
        System.out.println("Retângulo: Área = " + retangulo.area() + ", Perímetro = " + retangulo.perimetro());

        Triangulo trianguloBaseAltura = new Triangulo("BaseAltura", 6.0, 8.0, 0, 0);
        System.out.println("Triângulo (BaseAltura): Área = " + trianguloBaseAltura.calcularArea() + ", Perímetro = " + trianguloBaseAltura.calcularPerimetro());

        Triangulo trianguloHeron = new Triangulo("FormulaHeron", 3.0, 4.0, 5.0, 0);
        System.out.println("Triângulo (Fórmula de Heron): Área = " + trianguloHeron.calcularArea() + ", Perímetro = " + trianguloHeron.calcularPerimetro());

        Triangulo trianguloEquilatero = new Triangulo("TrianguloEquilatero", 5.0, 0, 0, 0);
        System.out.println("Triângulo (Triângulo Equilátero): Área = " + trianguloEquilatero.calcularArea() + ", Perímetro = " + trianguloEquilatero.calcularPerimetro());

        Triangulo trianguloAngulo = new Triangulo("CompLadosAngulo", 3.0, 4.0, 5.0, 45.0);
        System.out.println("Triângulo (ComprimentoLadosAngulo): Área = " + trianguloAngulo.calcularArea() + ", Perímetro = " + trianguloAngulo.calcularPerimetro());
    }
}
