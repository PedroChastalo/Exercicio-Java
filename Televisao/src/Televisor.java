public class Televisor {

    public int canal;
    public int volume;
    public boolean ligado;

    public Televisor() {
        canal = 0;
        volume = 0;
        ligado = false;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
    //não sei onde os getter e os setter deveriam ficar no codigo para respeitar a boa pratica de programação
    // e não achei nenhum artigo confiavel sobre então optei por manter no header apos a declaração da classe
    // se eu estiver errado por favor me avise para eu não errar nas proximas vezes.


    //Eu sei que como eu estou na mesma eu teoricamente não precisava de getter, isso foi so uma grande desculpa
    // para eu fazer essa pergunta

    public void ligarTv() {
        ligado = true;
        System.out.println("TV ligada");
    }

    public void desligarTv() {
        ligado = false;
        canal = 0;
        volume = 0;
        System.out.println("TV Desliagada");
    }

    public boolean subirCanal() {
        if (ligado && canal < 16){
            canal++;
            System.out.println("O canal subiu, canal atual: " + canal);

            return true;
        }
        if (!ligado){
            System.out.println("A tv esta desligada");
        }
        return false;
    }

    public boolean descerCanal(){
        if (ligado && canal > 0){
            canal--;
            System.out.println("O canal desceu, canal atual: " + canal);

            return true;
        }

        if (!ligado){
            System.out.println("A tv esta desligada");
        }

        return false;
    }
    public boolean subirVolume() {
        if (ligado && volume < 10){
            volume++;
            System.out.println("O volume subiu, volume atual: " +volume);

            return true;
        }
        if (!ligado){
            System.out.println("A tv esta desligada");
        }
        return false;
    }

    public boolean descerVolume() {
        if (ligado && volume > 0){
            volume--;
            System.out.println("O volume desceu, volume atual: " + volume);

            return true;
        }
        if (!ligado){
            System.out.println("A tv esta desligada");
        }
        return false;
    }
    public void status() {
        System.out.println("Status da TV:");
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }



}
