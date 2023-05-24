package objeto.consultoriomedico;

/**
 *
 * @author Vinicius Sempkoski
 */
import java.util.Scanner;

public class Funcionario extends Pessoa {

    public Funcionario(String nome, int idade, String cpf, String telefone, String email, String cep, String endereco, String cargo) {
        super(' ', nome, "", idade, ' ', cpf, telefone, email, cep, endereco);
    }
    private String cargo;
    private int idFunc;
    private double salario;

    Scanner scan = new Scanner(System.in);

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int id) {
        this.idFunc = idFunc;
    }

    public double mostrarSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void atualizarFuncionario() {

        System.out.println("Digite o novo cargo do funcionário: ");
        cargo = scan.nextLine();

        System.out.println("Digite o novo nome do funcionário: ");
        nome = scan.nextLine();

        System.out.println("Digite o novo telefone do funcionário: ");
        telefone = scan.nextLine();

        System.out.println("Digite a nova data de nascimento do funcionário: ");
        idade = scan.nextInt();

        System.out.println("Digite o novo ID do funcionário: ");
        idFunc = scan.nextInt();

        System.out.println("Digite o novo salário do funcionário: ");
        salario = scan.nextDouble();

        System.out.println("Funcionário atualizado com sucesso!");

        menu();

    }

    @Override
    public void cadastrar() {

        System.out.println("Digite o cargo do funcionário: ");
        cargo = scan.nextLine();

        System.out.println("Digite o nome do funcionário: ");
        nome = scan.nextLine();

        System.out.println("Digite o telefone do funcionário: ");
        telefone = scan.nextLine();

        System.out.println("Digite a data de nascimento do funcionário: ");
        idade = scan.nextInt();

        System.out.println("Digite o ID do funcionário: ");
        idFunc = scan.nextInt();

        System.out.println("Digite o salário do funcionário: ");
        setSalario(99999);

        System.out.println("Funcionário cadastrado com sucesso!");
        menu();

    }

    public static void menu() {
        Funcionario funcionario = new Funcionario("ola", ' ', "", "", "", "", "", ""
        );
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
                    funcionario.cadastrar();
                    break;
                case "2":
                    funcionario.atualizarFuncionario();
                    break;
                case "3":
                    System.out.println("nome: " + funcionario.idFunc);
                    System.out.println("Salário: " + funcionario.mostrarSalario());
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

}
