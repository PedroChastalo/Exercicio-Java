public class livroBiblioteca extends livro implements itemBiblioteca {

    String localizacao;
    int maxDias;
    boolean emprestado;

    public livroBiblioteca(String localizacao, String titulo, String autor, int anoEdicao, int maxDias) {
        super(titulo, autor, anoEdicao);
        this.localizacao = localizacao;
        this.maxDias = maxDias;
        this.emprestado = false;
    }

    public void emprestar() {
        if (emprestado == true) {
            System.out.println("livro emprestado!");
        } else {
            System.out.println("Livro ja emprestado");
        }
    }

    public void devolver() {
        if (emprestado == false) {
            System.out.println("Livro não esta emprestado");
        } else {
            System.out.println("Livro devolvido");
        }
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getMaxDias() {
        return maxDias;
    }

    public void setMaxDias(int maxDias) {
        this.maxDias = maxDias;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String localizacao() {
        return null;
    }

    @Override
    public int maxDias() {
        return 0;
    }

    @Override
    public boolean emprestado() {
        return false;
    }
}
