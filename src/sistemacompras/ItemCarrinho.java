package sistemacompras;

public class ItemCarrinho extends Produto {
    private int idItem;
    private int quantidadeProduto;
    private static int contador;

    {
        contador++;
    }

    public ItemCarrinho(String nome, double valor, int estoque, int quantidadeProduto) {
        super(nome, valor, estoque);
        this.quantidadeProduto = quantidadeProduto;
        this.idItem = contador-1;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }
}
