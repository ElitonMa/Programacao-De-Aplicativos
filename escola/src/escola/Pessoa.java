package escola;

// Classe
public class Pessoa {
    // Atributos
    // (-)
    private String nome;
    private int idade;

    // Construtor
    public Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    } // Fecha construtor

    // Método
    public void apresentar() {
        System.out.println("Olá, meu nome é: " + nome + " e tenho " + idade + " anos");
    }

    // Get (dar permissão do atributo)
    public String getNome() {
        return nome;
    }

    // (+)
    public int getIdade() {
        return idade;
    }
}
