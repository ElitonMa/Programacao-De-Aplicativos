package sistemacompras;

public class Produto {
    private String nome;
    private double valor;
    private int idProduto;
    private static int contador;
    private int estoque;

    {
        contador++;
    }

    public Produto(String nome, double valor, int estoque) {
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
        this.idProduto = contador-1;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public String getNome() {
        return nome;
    }

    public int getIdProduto() {
        return idProduto;
    }
}
