package escola;

public class Main {
    public static void main(String[] args) {
        // Criando as classes
        Pessoa pessoa = new Pessoa("Eliton", 16);
        Pessoa pessoa1 = new Pessoa("Erick", 16);
        Pessoa pessoa2 = new Pessoa("Kauã", 16);
        Pessoa pessoa3 = new Pessoa("Matheus", 16);
        Aluno aluno = new Aluno("Polyana Lemes", 16, "Técnico em Desenvolvimento de Sistemas");
        Professor professor = new Professor("Ricardo", 29, "Português");

        // Exibe as classes
        pessoa.apresentar();
        pessoa1.apresentar();
        pessoa2.apresentar();
        pessoa3.apresentar();
        aluno.apresentar();
        aluno.estudar();
        professor.ensinar();

    }
}
