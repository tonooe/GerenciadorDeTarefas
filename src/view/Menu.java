package view;

import service.TarefaService;
import java.util.Scanner;

public class Menu {
    private TarefaService tarefaService;
    private Scanner scanner;

    // Construtor - inicializa o serviço de tarefas e o scanner
    public Menu() {
        this.tarefaService = new TarefaService();
        this.scanner = new Scanner(System.in);
    }

    // Exibe o menu para o usuário
    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("Gerenciador de Tarefas");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Marcar Tarefa como Concluída");
            System.out.println("4 - Remover Tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite a descrição da tarefa: ");
                        String descricao = scanner.nextLine();
                        tarefaService.adicionarTarefa(descricao);
                        break;
                    case 2:
                        tarefaService.listarTarefas();
                        break;
                    case 3:
                        System.out.print("Digite o ID da tarefa para concluir: ");
                        int idConcluir = scanner.nextInt();
                        tarefaService.concluirTarefa(idConcluir);
                        break;
                    case 4:
                        System.out.print("Digite o ID da tarefa para remover: ");
                        int idRemover = scanner.nextInt();
                        tarefaService.excluirTarefa(idRemover);
                        break;
                    case 0:
                        System.out.println("Saindo do Gerenciador de Tarefas...");
                        break;
                    default:
                        System.out.println("X Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("X Entrada inválida! Digite um número.");
                scanner.nextLine(); // limpa a entrada inválida
                opcao = -1; // para continuar o loop sem fechar o programa
            }
        } while (opcao != 0);
    }
}
