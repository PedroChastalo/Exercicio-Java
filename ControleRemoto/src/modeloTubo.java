public class modeloTubo extends TV implements  iControleRemoto{

    public modeloTubo(int tamanho, String modelo, int canalAtual, int volume, boolean ligadaDeslgada) {
        super(tamanho, modelo, canalAtual, volume, ligadaDeslgada);
    }

    @Override
    public void mudarCanal(int canal) {
        if (ligada) {
            canalAtual = canal;
        }
    }

    @Override
    public void aumentarVolume() {
        if (ligada) {
            volume++;
        }
    }

    @Override
    public void diminuirVolume() {
        if (ligada) {
            volume--;
        }
    }

    @Override
    public void ligar() {
        ligada = true;
    }

    @Override
    public void desligar() {
        ligada = false;
    }

    @Override
    public void abrirNetflix() {
        if (ligada) {
            System.out.println("Abrindo Netflix...");
        }
    }
}
