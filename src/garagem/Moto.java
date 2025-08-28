package garagem;

public class Moto extends Veiculo {

    private boolean capacete = true;

    public Moto(String motor, int capacidadeTransporte) {
        super(2, motor, capacidadeTransporte);
    }

    @Override
    public void exibirDados() {
        System.out.println("Essa moto tem " + getRodas() + " rodas, o motor é: " + getMotor() + " tem capacidade de transporte de " + getCapacidadeTransporte() + "Kg e o capacete é obrigátorio" );
    }
}
