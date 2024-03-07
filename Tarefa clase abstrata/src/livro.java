public abstract class livro {

    private String titulo;
    private String autor;
    private int anoEdicao;

    public livro(String titulo, String autor, int anoEdicao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoEdicao = anoEdicao;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(int anoEdicao) {
        this.anoEdicao = anoEdicao;
    }
}
