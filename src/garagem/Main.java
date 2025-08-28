package garagem;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo(3, "V2", 120);
        Carro carro = new Carro(4,"V8",500, true, false);
        Moto moto = new Moto("V5", 250);
        Caminhao caminhao = new Caminhao(8, "V12", 3000);

        veiculo.exibirDados();
        carro.exibirDados();
        moto.exibirDados();
        caminhao.exibirDados();
    }
}
