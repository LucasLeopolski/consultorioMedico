package objeto.consultoriomedico;

/**
 *
 * @author aluno
 */
import java.util.Scanner;

public class MenuFuncionario {
    private Funcionario funcionario;

    public MenuFuncionario() {
        funcionario = new Funcionario("", 0, "", "", "", "", "", "");
    }

    public void exibirMenu() {
        Scanner scan = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Atualizar funcionário");
            System.out.println("3 - Mostrar salário");
            System.out.println("4 - Sair");

            opcao = scan.nextLine();

            switch (opcao) {
                case "1":
                    funcionario.cadastrarFuncionario();
                    break;
                case "2":
                    funcionario.atualizarFuncionario();
                    break;
                case "3":
                    System.out.println("Salários em breve em nova atualização!");
                    break;
                case "4":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (!"4".equals(opcao));
    }

    public static void main(String[] args) {
        MenuFuncionario menu = new MenuFuncionario();
        menu.exibirMenu();
    }
}

