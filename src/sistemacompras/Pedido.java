package sistemacompras;

import java.util.ArrayList;

public class Pedido {
    private int idCliente;
    private double valor;
    private int idPedido;

    public double calcularTotal(Carrinho carrinho) {
        ArrayList<ItemCarrinho> a = carrinho.getItens();
        double valorTotal = 0;

        // Percorre o todos os itens do carrinho e soma os valores dos produtos
        for (ItemCarrinho i : a) {
            valorTotal += i.getValor() * i.getQuantidadeProduto();
        }

        // Retorna o valor somado
        return valorTotal;
    }


}
