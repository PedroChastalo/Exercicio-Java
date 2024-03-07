public class TV {

    protected int tamanho;
    protected String modelo;
    protected int canalAtual;
    protected int volume;
    protected boolean ligada;


    public TV(int tamanho, String modelo, int canalAtual, int volume, boolean ligada){

        this.tamanho = tamanho;
        this.modelo = modelo;
        this.canalAtual = canalAtual;
        this.volume = volume;
        this.ligada = ligada;
    }

    public void informacoes(){
        System.out.println("O tamano da tv é: "+ tamanho + " polegadas");
        System.out.println("O modelo da tv é: "+ modelo);
        System.out.println("O canal atual é: " + canalAtual);
        System.out.println("O volume é: " + volume);

        if (ligada){
            System.out.println("Ela esta ligada");
        }else{
            System.out.println("Esta desligada");
        }
    }
}
