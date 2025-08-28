package garagem;

public class Veiculo {
    private int rodas;
    private String motor;
    private int capacidadeTransporte;

    public Veiculo(int rodas, String motor, int capacidadeTransporte) {
        this.rodas = rodas;
        this.motor = motor;
        this.capacidadeTransporte = capacidadeTransporte;
    }

    public void exibirDados() {
        System.out.println("Esse veiculo tem " + rodas + ", o motor é: " + motor + " e tem capacidade de transporte de " + capacidadeTransporte + "Kg");
    }

    public int getCapacidadeTransporte() {
        return capacidadeTransporte;
    }

    public String getMotor() {
        return motor;
    }

    public int getRodas() {
        return rodas;
    }
}
