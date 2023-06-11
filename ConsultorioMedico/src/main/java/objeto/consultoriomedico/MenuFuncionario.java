package objeto.consultoriomedico;

import java.util.Scanner;

public class MenuFuncionario {
    private FuncionarioServicos funcionarioService;

    public MenuFuncionario() {
        funcionarioService = new FuncionarioServicos();
    }

    public void exibirMenu() {
        Scanner scan = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Atualizar funcionário");
            System.out.println("3 - Mostrar funcionários");
            System.out.println("4 - Sair");

            opcao = scan.nextLine();

            switch (opcao) {
                case "1":
                    cadastrarFuncionario();
                    break;
                case "2":
                    atualizarFuncionario();
                    break;
                case "3":
                    mostrarFuncionarios();
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

    private void cadastrarFuncionario() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = scan.nextLine();

        System.out.println("Digite o CPF do funcionário: ");
        String cpf = scan.nextLine();

        System.out.println("Digite o email do funcionário: ");
        String email = scan.nextLine();

        System.out.println("Digite o cargo do funcionário: ");
        String cargo = scan.nextLine();
        
         if (cargo.equalsIgnoreCase("medico")) {
         System.out.println("Digite a especialidade do médico: ");
         String especialidade = scan.nextLine();
        }

        funcionarioService.cadastrarFuncionario(nome, ' ', cpf, " ", email, " ", " ", cargo);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private void atualizarFuncionario() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ID do funcionário a ser atualizado: ");
        int idFuncionario = scan.nextInt();
        scan.nextLine();

        Funcionario funcionario = funcionarioService.buscarFuncionario(idFuncionario);

        if (funcionario != null) {
            System.out.println("Digite o novo cargo do funcionário: ");
            String novoCargo = scan.nextLine();

            funcionario.setCargo(novoCargo);
            funcionarioService.atualizarFuncionario(funcionario);

            System.out.println("Funcionário atualizado com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado!");
        }
    }

    private void mostrarFuncionarios() {
        System.out.println("Funcionários cadastrados:");
        for (Funcionario funcionario : funcionarioService.listarFuncionarios()) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Cargo: " + funcionario.getCargo());
            System.out.println("ID: " + funcionario.getIdFuncionario());
            System.out.println("------------------------");
        }
    }
}
    