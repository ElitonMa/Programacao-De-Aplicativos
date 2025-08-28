package escola;

// 'extends' significa herança
public class Aluno extends Pessoa {
    private String curso;

    // No construtor passa o paramêtro igual a Classa Mãe (Pessoa)
    public Aluno(String nome, int idade, String curso) {
        super(nome, idade); // Chama o construtor da superClasse (Pessoa)
        this.curso = curso;
    }

    public void estudar() {
        System.out.println(getNome() + " está estudando " + curso + "!!!");
    }


}
