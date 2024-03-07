

public class Principal {
    public static void main(String[] args){
    Produto p = new Produto("Produto 1", 20, 0, 5);

    System.out.println();
    p.exebirDescricao();
    System.out.println();

    p.excluirItem(5);
    System.out.println();

    p.incluirItem(5);
    System.out.println();

    p.excluirItem(10);
    System.out.println();

    p.incluirItem(30);
    System.out.println();

    p.exebirDescricao();

    //este foi muito divertido de fazer 

    }
}
