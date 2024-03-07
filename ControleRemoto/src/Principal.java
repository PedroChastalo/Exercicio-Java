public class Principal {
    public static void main(String[] args) {
        modeloTubo tubo = new modeloTubo(30, "Tubo", 0,0, true);
        ModeloSmart smart = new ModeloSmart(50, "smart", 0,5, false);

        tubo.ligar();
        tubo.mudarCanal(5);
        tubo.aumentarVolume();

        smart.ligar();
        smart.mudarCanal(10);
        smart.diminuirVolume();
        smart.abrirNetflix();

        System.out.println("Informações da TV de Tubo:");
        tubo.informacoes();

        System.out.println("\nInformações da TV Smart:");
        smart.informacoes();
    }
}