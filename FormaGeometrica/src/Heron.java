public class Heron {
    public static double calcularArea(double a, double b, double c){
        double s = (a+b+c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
