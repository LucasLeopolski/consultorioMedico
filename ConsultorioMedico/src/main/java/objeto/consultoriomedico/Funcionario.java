package objeto.consultoriomedico;

/**
 *
 * @author Vinicius Sempkoski
 */
import java.util.Scanner;

public class Funcionario {

    public String nome;
    public String telefone;
    public String dataNascimento;
    public String cargo;
    public String supervisor;
    public String dataIngresso;
    public String horarioEntrada;
    public String horarioSaida;
    private int id;
    private int codPonto;
    private double salario;

    Scanner scan = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodPonto() {
        return codPonto;
    }

    public void setCodPonto(int codPonto) {
        this.codPonto = codPonto;
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
        dataNascimento = scan.nextLine();

        System.out.println("Digite o novo cargo do funcionário: ");
        cargo = scan.nextLine();

        System.out.println("Digite o nome do novo supervisor do funcionário: ");
        supervisor = scan.nextLine();

        System.out.println("Digite a nova data de ingresso do funcionário: ");
        dataIngresso = scan.nextLine();

        System.out.println("Digite o novo horário de entrada do funcionário: ");
        horarioEntrada = scan.nextLine();

        System.out.println("Digite o novo horário de saída do funcionário: ");
        horarioSaida = scan.nextLine();

        System.out.println("Digite o novo ID do funcionário: ");
        id = scan.nextInt();

        System.out.println("Digite o novo código de ponto do funcionário: ");
        codPonto = scan.nextInt();

        System.out.println("Digite o novo salário do funcionário: ");
        salario = scan.nextDouble();

        System.out.println("Funcionário atualizado com sucesso!");
    }

    public double calcularSalario() {
        return salario;
    }

    public void cadastrarFuncionario() {

        System.out.println("Digite o nome do funcionário: ");
        this.nome = scan.nextLine();

        System.out.println("Digite o telefone do funcionário: ");
        this.telefone = scan.nextLine();

        System.out.println("Digite a data de nascimento do funcionário: ");
        this.dataNascimento = scan.nextLine();

        System.out.println("Digite o cargo do funcionário: ");
        this.cargo = scan.nextLine();

        System.out.println("Digite o nome do supervisor do funcionário: ");
        this.supervisor = scan.nextLine();

        System.out.println("Digite a data de ingresso do funcionário: ");
        this.dataIngresso = scan.nextLine();

        System.out.println("Digite o horário de entrada do funcionário: ");
        this.horarioEntrada = scan.nextLine();

        System.out.println("Digite o horário de saída do funcionário: ");
        this.horarioSaida = scan.nextLine();

        System.out.println("Digite o ID do funcionário: ");
        this.id = scan.nextInt();

        System.out.println("Digite o código de ponto do funcionário: ");
        this.codPonto = scan.nextInt();

        System.out.println("Digite o salário do funcionário: ");
        this.salario = scan.nextDouble();

        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public static void menu() {
        Funcionario funcionario = new Funcionario();

        Scanner Scan = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Atualizar funcionário");
            System.out.println("3 - Calcular salário");
            System.out.println("4 - Sair");

            opcao = Scan.nextLine();

            switch (opcao) {
                case "1" -> {
                    funcionario.cadastrarFuncionario();
                }
                case "2" -> {
                    funcionario.atualizarFuncionario();
                }
                case "3" -> {
                    System.out.println("Salário: " + funcionario.calcularSalario());
                }
                case "4" -> {
                    System.out.println("Saindo...");
                }
                default -> {
                    System.out.println("Opção inválida!");
                }
            }
        } while (!"4".equals(opcao));
    }
}
