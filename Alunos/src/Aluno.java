public class Aluno {
    private String nome;
    private double n1;
    private double n2;
    private double media;
    private Media cMedia;

    public Aluno(String nome, double n1, double n2) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.cMedia = new Media();
        this.media = 0;
    }

    public void exibirNotas() {
        System.out.println("Notas do aluno " + nome + ":");
        System.out.println("Nota 1: " + n1);
        System.out.println("Nota 2: " + n2);
    }

    public void calcularMedia(String tipoMedia, int peso1, int peso2) {
        if (tipoMedia.equals("Simples")) {
            System.out.println("Calculando media simples");
            media = cMedia.mediaSimples(n1, n2);
        } else if (tipoMedia.equals("Ponderada")) {
            System.out.println("Calculando media ponderada");
            media = cMedia.mediaPonderada(n1, n2, peso1, peso2);
        } else if (tipoMedia.equals("Geometrica")) {
            System.out.println("Calculando media geometrica");
            media = cMedia.mediaGeometrica(n1, n2);
        } else {
            System.out.println("Tipo de média não suportado.");
        }
    }

    public void exibirMedia() {
        System.out.println("Média do aluno " + nome + ": " + media);
    }

    public void exibirAprovado() {
        if (media >= 7.0) {
            System.out.println(nome + " foi aprovado.");
        } else {
            System.out.println(nome + " foi reprovado.");
        }
    }
}