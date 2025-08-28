package exemplosAtividade;

public class ExemploAcoplamento {
    public int valor;

    public static class ClasseDependente {
        public int valorCalculado;
        // Se utiliza um atributo de outra classe
        ExemploAcoplamento ex = new ExemploAcoplamento();

        public void calcularValor(ExemploAcoplamento valor) {
            valorCalculado = ex.valor;
        }
    }
}
