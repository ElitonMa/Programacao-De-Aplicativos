package cadastroEventos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criando classe para gerenciar eventos
        GerenciadorEvento gerenciador = new GerenciadorEvento();

        boolean sair = false;
        int opcoes = 0;
        String nomeEvento;
        String dataEvento;
        String localEvento;


        do {
            System.out.println("Bem-vindo ao gerenciador de eventos!");
            System.out.println("Digite 1 para adicionar um evento.");
            System.out.println("Digite 2 para listar os eventos");
            System.out.println("Digite 0 para sair do programa.");
            opcoes = scanner.nextInt();

            // Necessário para remover o /n que é colocado apos apertar Enter no terminal.
            scanner.nextLine();

            switch (opcoes) {
                case 1:

                    System.out.println("Digite o nome do evento.");
                    nomeEvento = scanner.nextLine();

                    System.out.println("Digite a data do evento (Ex: 01-06-2020).");
                    dataEvento = scanner.nextLine();

                    System.out.println("Digite o local do evento.");
                    localEvento = scanner.nextLine();

                    // Adicinando o evento ao gerenciador
                    gerenciador.adicionar(new Evento(nomeEvento,dataEvento,localEvento));
                    break;

                case 2:

                    // Listando os eventos
                    gerenciador.listar();
                    break;

                case 0:
                    System.out.println("Saindo..");
                    sair = true;
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }   while (!sair);
        scanner.close();
    }
}
