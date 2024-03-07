

public class Produto {
    private String descricao;
    private int estoqueMax;
    private int estoqueMin;
    private int quantidade;

    public Produto(String descricao, int estoqueMax, int estoqueMin, int quantidade){

        this.descricao = descricao;
        this.estoqueMax = estoqueMax;
        this.estoqueMin = estoqueMin;
        this.quantidade = quantidade;

    }

    public void incluirItem(int n) {
        int eDisponivel = quantidade - estoqueMax;
        if (n <= eDisponivel) {
            quantidade += n;
            System.out.println("Produtos adicionados, a quantidade de produtos atuais é: " + quantidade);
        } else {
            alertaEstoqueMax();
        }
    }

    public void excluirItem(int n) {
            int sobra = quantidade - n;
            if (sobra >= estoqueMin){
                quantidade = sobra;
                System.out.println("Items removidos, quantidade restante é " + quantidade);
            } else {
                alertaEstoqueMin();
            }
    }

    private void alertaEstoqueMin() {
        System.out.println("Não foi possivel remover pois não a produtos o suficiente: ");
    }
    private void alertaEstoqueMax() {
        System.out.println("Não foi possivel adicionar pois o valor acima do suportado pelo estoque");
    }

    public void exebirDescricao(){
        System.out.println("A descrição do item é:" + descricao);
        System.out.println("tem " + quantidade + " items em estoque");
        System.out.println("O estoque maximo é: " + estoqueMax);
        System.out.println("O estoque minimo é " + estoqueMin);
    }
}
