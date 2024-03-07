public class Principal {
    public static void main(String[] args) {
        livroBiblioteca livro1 = new livroBiblioteca("estante 2", "Sherlock holmes", "Arthur conam doyle", 1892, 14);
        livroBiblioteca livro2 = new livroBiblioteca("estante 1", "Use a cabeça em C","David Griffiths", 2013, 20);

        System.out.println("Livro 1:");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano de Edição: " + livro1.getAnoEdicao());
        System.out.println("Localização: " + livro1.getLocalizacao());
        System.out.println("Máximo de Dias de Empréstimo: " + livro1.maxDias);

        livro1.emprestar();
        System.out.println("Livro 1 está emprestado? " + livro1.emprestado);

        livro1.devolver();
        System.out.println("Livro 1 está emprestado? " + livro1.emprestado());

        System.out.println("\nLivro 2:");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Ano de Edição: " + livro2.getAnoEdicao());
        System.out.println("Localização: " + livro2.getLocalizacao());
        System.out.println("Máximo de Dias de Empréstimo: " + livro2.getMaxDias());

        livro2.emprestar();
        System.out.println("Livro 2 está emprestado? " + livro2.emprestado());
    }
}
