package escola;

// Classe Professor herdando da classe Pessoa
public class Professor extends Pessoa {
    private String disciplina;

    // Construtor da classe Professor
    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade); // Está chamando o construtor da super classe Pessoa, a classe que está sendo herdada
        this.disciplina = disciplina;
    }

    public void ensinar() {
        System.out.println("O professor " + getNome() + " está ensinando " + disciplina + "!!!");
    }
}