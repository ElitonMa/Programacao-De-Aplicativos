package sistemacompras;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Cliente {
    private int IdCliente;
    private String nome;
    private double saldo;
    private String dataCadastro;
    private String endereco;
    private String email;
    private String cpf;

    public void realizarCompra() {
    }

    public void efetuarLogin() {
        LocalDate dataAtual = LocalDate.now();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        this.nome = sc.nextLine();

        System.out.println("Digite o seu cpf:");
        this.cpf = sc.nextLine();

        System.out.println("Digite o seu email:");
        this.email = sc.nextLine();

        this.dataCadastro = dataAtual.toString();
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " |Cpf: " + cpf + " |Email: " + email + " |Cadastro: " + dataCadastro);
    }
}
