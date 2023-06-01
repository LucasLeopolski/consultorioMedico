package objeto.consultoriomedico;

/**
 *
 * @author Vinicius Sempkoski
 */
import java.util.Scanner;

public class Funcionario extends Pessoa {
    private String cargo;
    private int idFuncionario;
    private double salario;

    public Funcionario(String nome, int idade, String cpf, String telefone, String email, String cep, String endereco, String cargo) {
        super(' ', nome, "", idade, ' ', cpf, telefone, email, cep, endereco);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void cadastrarFuncionario() {
        super.cadastrarFuncionario();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o cargo do funcionário: ");
        cargo = scan.nextLine();

        System.out.println("Digite o ID do funcionário: ");
        idFuncionario = scan.nextInt();

        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void atualizarFuncionario() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o novo cargo do funcionário: ");
        cargo = scan.nextLine();

        System.out.println("Digite o novo ID do funcionário: ");
        idFuncionario = scan.nextInt();

        System.out.println("Funcionário atualizado com sucesso!");
    }
}
