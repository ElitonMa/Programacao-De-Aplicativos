    package garagem;

    public class Carro extends Veiculo {
        private boolean arCondicionado;
        private boolean quatroPortas;

        public Carro(int rodas, String motor, int capacidadeTransporte, boolean arCondicionado, boolean quatroPortas) {
            super(rodas, motor, capacidadeTransporte);
            this.arCondicionado = arCondicionado;
            this.quatroPortas = quatroPortas;
        }

        @Override
        public void exibirDados() {
            System.out.println("Esse carro tem " + getRodas() + " rodas, o motor é: " + getMotor() + " a capacidade de transporte é de " + getCapacidadeTransporte() + "Kg ele " + temArCondicionado() + " e ele " + temQuatroPortas() );
        }

        public String temArCondicionado() {
            if (arCondicionado) {
                return "tem ar-condicionado";
            }
            else {
                return "não tem ar-condicionado";
            }
        }

        public String temQuatroPortas() {
            if (quatroPortas) {
                return "tem quatro portas";
            }
            else  {
                return "não tem quatro portas";
            }
        }
    }
