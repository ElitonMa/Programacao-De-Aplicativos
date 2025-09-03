package sistemacompras;

import java.util.ArrayList;

public class Carrinho {
    private int quantidadeProdutos;
    private int idCarrinho;
    private int idCliente;
    ArrayList<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarProduto(ItemCarrinho i) {
        itens.add(i);
    }

    public void removerProduto(int id) {
        itens.remove(id);
    }

    public void verificarEstoque(int id) {
        System.out.println("Total de estoque neste produto: " + itens.get(id).getEstoque());
    }

    public ArrayList<ItemCarrinho> getItens() {
        return itens;
    }
}
