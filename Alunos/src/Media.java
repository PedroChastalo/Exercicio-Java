public class Media {
    public double mediaSimples(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    public double mediaPonderada(double n1, double n2, int peso1, int peso2) {
        return (n1 * peso1 + n2 * peso2) / (peso1 + peso2);
    }

    public double mediaGeometrica(double n1, double n2) {
        return Math.sqrt(n1 * n2);
    }
}