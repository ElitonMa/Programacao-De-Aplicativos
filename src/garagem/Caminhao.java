package garagem;

public class Caminhao extends Veiculo {
    private boolean carroceira = true;

    public Caminhao(int rodas, String motor, int capacidadeTransporte) {
        super(rodas, motor, capacidadeTransporte);
    }

    @Override
    public void exibirDados() {
        System.out.println("Esse caminhão tem " + getRodas() + " rodas, tem capacidade de transporte de " + getCapacidadeTransporte() + "Kg e tem carroceira");
    }



}
