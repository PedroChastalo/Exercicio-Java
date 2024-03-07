public class Principal {
    public static void main(String[] args) {

        System.out.println("");
        Aluno aluno1 = new Aluno("Aluno1", 7.5, 8.0);
        System.out.println("");

        aluno1.exibirNotas();
        System.out.println("");

        aluno1.calcularMedia("Simples", 0, 0);
        aluno1.exibirMedia();
        System.out.println("");

        aluno1.exibirAprovado();
        System.out.println("");

        Aluno aluno2 = new Aluno("Aluno2", 6, 9);
        aluno2.exibirNotas();
        System.out.println("");

        aluno2.calcularMedia("Ponderada", 2, 3);
        aluno2.exibirMedia();
        System.out.println("");

        aluno2.exibirAprovado();
        System.out.println("");

        Aluno aluno3 = new Aluno("Aluno3", 4, 9);
        System.out.println("");

        aluno3.exibirNotas();
        System.out.println("");

        aluno3.calcularMedia("Geometrica", 0, 0);
        aluno3.exibirMedia();
        System.out.println("");

        aluno3.exibirAprovado();
        System.out.println("");
    }
}
