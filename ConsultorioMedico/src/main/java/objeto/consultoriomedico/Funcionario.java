package objeto.consultoriomedico;

/**
 *
 * @author Vinicius Sempkoski
 */
import java.util.Scanner;

public class Funcionario extends Pessoa {

    public Funcionario(String nome, int idade, String cpf, String telefone, String email, String cep, String endereco) {
        super(' ', nome, "", idade, ' ', cpf, telefone, email, cep, endereco);
    }
    public String cargo;
    public String supervisor;
    private int idFunc;
    private double salario;

    Scanner scan = new Scanner(System.in);

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int id) {
        this.idFunc = idFunc;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void atualizarFuncionario() {

        System.out.println("Digite o novo nome do funcionário: ");
        nome = scan.nextLine();

        System.out.println("Digite o novo telefone do funcionário: ");
        telefone = scan.nextLine();

        System.out.println("Digite a nova data de nascimento do funcionário: ");
        idade = scan.nextInt();

        System.out.println("Digite o novo cargo do funcionário: ");
        cargo = scan.nextLine();

        System.out.println("Digite o nome do novo supervisor do funcionário: ");
        supervisor = scan.nextLine();

        System.out.println("Digite o novo ID do funcionário: ");
        idFunc = scan.nextInt();

        System.out.println("Digite o novo salário do funcionário: ");
        salario = scan.nextDouble();

        System.out.println("Funcionário atualizado com sucesso!");

        Funcionario funcionario = new Funcionario(nome, idade, cpf, telefone, email, cep, endereco);
        menu(funcionario);

    }

    public double calcularSalario() {
        return salario;
    }

    @Override
    public void cadastrar() {

        System.out.println("Digite o nome do funcionário: ");
        this.nome = scan.nextLine();

        System.out.println("Digite o telefone do funcionário: ");
        this.telefone = scan.nextLine();

        System.out.println("Digite a data de nascimento do funcionário: ");
        this.idade = scan.nextInt();

        System.out.println("Digite o cargo do funcionário: ");
        this.cargo = scan.nextLine();

        System.out.println("Digite o nome do supervisor do funcionário: ");
        this.supervisor = scan.nextLine();

        System.out.println("Digite o ID do funcionário: ");
        this.idFunc = scan.nextInt();

        System.out.println("Digite o salário do funcionário: ");
        this.salario = scan.nextDouble();

        System.out.println("Funcionário cadastrado com sucesso!");
        Funcionario funcionario = new Funcionario(nome, idade, cpf, telefone, email, cep, endereco);
        menu(funcionario);
    }

    public static void menu(Funcionario funcionario) {
        Scanner scan = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Atualizar funcionário");
            System.out.println("3 - Calcular salário");
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
                    System.out.println("Salário: " + funcionario.calcularSalario());
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
