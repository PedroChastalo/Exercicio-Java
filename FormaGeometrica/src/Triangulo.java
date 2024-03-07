public class Triangulo implements iFormasGeometricas {

    double angulo;
    double ladoA;
    double ladoB;
    double ladoC;
    String metodoCalcularArea;


    Triangulo(String metodoCalcularArea, double ladoA,double ladoB,double ladoC, double angulo){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.metodoCalcularArea = metodoCalcularArea;
    }

    public double calcularArea() {
        switch (metodoCalcularArea) {
            case "BaseAltura":
                return BaseAltura.calcularArea(ladoA, ladoB);
            case "FormulaHeron":
                return Heron.calcularArea(ladoA, ladoB, ladoC);
            case "TrianguloEquilatero":
                return Equilatero.calcularArea(ladoA);
            case "ComprimentoLadosAngulo":
               return compLadosAngulo.calcularArea(ladoA, ladoB, ladoC, angulo);
            default:
                return 0.0;
        }

    }
    public double calcularPerimetro(){
        return ladoA + ladoB + ladoC;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimetro() {
        return 0;
    }
}
