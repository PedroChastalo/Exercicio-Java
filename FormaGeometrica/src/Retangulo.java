public class Retangulo implements iFormasGeometricas{

    double comprimento;
    double largura;
    public Retangulo(double comprimento, double largura){
    this.comprimento = comprimento;
    this.largura = largura;
    }

    @Override
    public double area() {
        return comprimento * largura;
    }

    @Override
    public double perimetro() {
        return 2*(comprimento*largura);
    }
}
