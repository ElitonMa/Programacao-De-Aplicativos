package sistemacompras;

public class Main {
    public static void main(String[] args) {
        // Criando os objetos
        Cliente cliente = new Cliente();
        Produto produto1 = new Produto("Vinho", 23.4d, 15);
        Produto produto2 = new Produto("Sabonete", 18.90d, 20);

        // Passando os produtos para o ItemCarrinho
        ItemCarrinho item1 = new ItemCarrinho(produto1.getNome(), produto1.getValor(), produto1.getEstoque(), 2);
        ItemCarrinho item2 = new ItemCarrinho(produto2.getNome(), produto2.getValor(), produto2.getEstoque(), 10);

        Carrinho carrinho = new Carrinho();
        Pedido pedido = new Pedido();

        // Adicionando os itens para o carrinho
        carrinho.adicionarProduto(item1);
        carrinho.adicionarProduto(item2);

        // Testes de lógica
        carrinho.verificarEstoque(0);

        System.out.println("Total: " + pedido.calcularTotal(carrinho));

        cliente.efetuarLogin();
        cliente.exibirDados();
    }
}
