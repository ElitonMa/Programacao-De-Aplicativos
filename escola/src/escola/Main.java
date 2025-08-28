package escola;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Eliton", 16);
        pessoa.apresentar();

        Pessoa pessoa1 = new Pessoa("Erick", 16);
        pessoa1.apresentar();

        Pessoa pessoa2 = new Pessoa("Kauã", 16);
        pessoa2.apresentar();

        Pessoa pessoa3 = new Pessoa("Matheus", 16);
        pessoa3.apresentar();

        Aluno aluno = new Aluno("Polyana Lemes", 16, "Técnico em Desenvolvimento de Sistemas");
        aluno.estudar();

        Professor professor = new Professor("Ricardo", 29, "Português");
        professor.ensinar();
    }
}
