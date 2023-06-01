package objeto.consultoriomedico;
import java.util.Scanner;
/**
 *
 * @author Uelberti
 */
public class Paciente extends Pessoa{
     public Paciente() {
    }

    public Paciente(int idPessoa, String nome, String sobrenome, int idade, char sexo, String cpf, String telefone, String email, String cep, String endereco) {
        super(idPessoa, nome, sobrenome, idade, sexo, cpf, telefone, email, cep, endereco);
    }
    public int idPaciente;

    public void atualizarPaciente() {
        Scanner ler = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Qual campo você deseja atualizar?");
            System.out.println("1 - Nome");
            System.out.println("2 - Idade");
            System.out.println("3 - CPF");
            System.out.println("4 - Telefone ");
            System.out.println("5 - E-mail");
            System.out.println("6 - CEP");
            System.out.println("7 - Endereço");
            System.out.println("0 - Sair");

            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o novo nome do paciente: ");
                    this.nome = ler.next();
                    break;
                case 2:
                    System.out.print("Digite a nova idade do paciente: ");
                    this.idade = ler.nextInt();
                    break;
                case 3:
                    System.out.print("Digite o novo CPF do paciente: ");
                    this.cpf = ler.next();
                    break;
                case 4:
                    System.out.print("Digite o novo telefone fixo do paciente: ");
                    this.telefone = ler.next();
                    break;
                case 5:
                    System.out.print("Digite o novo e-mail do paciente: ");
                    this.email = ler.nextLine();
                    break;
                case 6:
                    System.out.print("Digite o novo CEP do paciente: ");
                    this.cep = ler.next();
                    break;
                case 7:
                    System.out.print("Digite o novo endereço do paciente: ");
                    this.endereco = ler.nextLine();
                    break;
                case 0:
                    System.out.println("Saindo do menu de atualização...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        System.out.println("Dados do paciente atualizados com sucesso!");
        menu();
    }

    public void pesquisarPaciente() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o CPF do paciente que deseja pesquisar: ");
        String cpfPesquisa = ler.nextLine();

        if (cpfPesquisa.equals(this.cpf)) {
            System.out.println("Paciente encontrado!");
            System.out.println("Nome: " + this.nome);
            System.out.println("Idade: " + this.idade);
            System.out.println("CPF: " + this.cpf);
            System.out.println("Telefone fixo: " + this.telefone);
            System.out.println("E-mail: " + this.email);
            System.out.println("CEP: " + this.cep);
            System.out.println("Endereço: " + this.endereco);
        } else {
            System.out.println("Paciente não encontrado!");
        }
        menu();
    }

    @Override
    public void cadastrarPaciente() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Endereço: " + this.endereco);
        System.out.printf("Id Paciente: ");
        this.novoPaciente.idPaciente = random.nextInt(1000);
        System.out.println(novoPaciente.idPaciente);
        menu();
    }

    public void menu() {
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String escolha;
            System.out.println("Escolha uma opção!");
            System.out.println("(0) Cadastrar Paciente\n(1) Atualizar Paciente\n(2) Pesquisar Paciente\n(3) Menu Principal");
            escolha = ler.next();
            switch (escolha) {
                case "0" ->
                    cadastrarPaciente();
                case "1" ->
                    atualizarPaciente();
                case "2" ->
                    pesquisarPaciente();
                case "3" ->
                    i = 6;
                default ->
                    System.out.println("Opção inválida.");
            }
        }
    }
}
