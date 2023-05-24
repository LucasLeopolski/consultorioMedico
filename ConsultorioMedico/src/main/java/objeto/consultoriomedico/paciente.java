package objeto.consultoriomedico;

import java.util.Scanner;

/**
 *
 * @author Uelberti
 */
class paciente {
    public String[] nomePaciente = new String[100];
    public String[] cadastrarPaciente = new String[100];

    public String nome;
    public int idade;
    public char sexo;
    private int id;
    private String cpf;
    private String rg;
    private String telFixo;
    private String telMovel;
    private String email;
    private String cep;
    private String endereco;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    public String getTelMovel() {
        return telMovel;
    }

    public void setTelMovel(String telMovel) {
        this.telMovel = telMovel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

public void atualizarPaciente() {
    Scanner ler = new Scanner(System.in);
    int opcao;

    do {
        System.out.println("Qual campo você deseja atualizar?");
        System.out.println("1 - Nome");
        System.out.println("2 - Idade");
        System.out.println("3 - CPF");
        System.out.println("4 - RG");
        System.out.println("5 - Telefone Fixo");
        System.out.println("6 - Telefone Móvel");
        System.out.println("7 - E-mail");
        System.out.println("8 - CEP");
        System.out.println("9 - Endereço");
        System.out.println("0 - Sair");

        opcao = ler.nextInt();

        switch (opcao) {
            case 1 -> {
                System.out.print("Digite o novo nome do paciente: ");
                this.nome = ler.next();
            }
            case 2 -> {
                System.out.print("Digite a nova idade do paciente: ");
                this.idade = ler.nextInt();
            }
            case 3 -> {
                System.out.print("Digite o novo CPF do paciente: ");
                this.cpf = ler.nextLine();
            }
            case 4 -> {
                System.out.print("Digite o novo RG do paciente: ");
                this.rg = ler.nextLine();
            }
            case 5 -> {
                System.out.print("Digite o novo telefone fixo do paciente: ");
                this.telFixo = ler.nextLine();
            }
            case 6 -> {
                System.out.print("Digite o novo telefone móvel do paciente: ");
                this.telMovel = ler.nextLine();
            }
            case 7 -> {
                System.out.print("Digite o novo e-mail do paciente: ");
                this.email = ler.nextLine();
            }
            case 8 -> {
                System.out.print("Digite o novo CEP do paciente: ");
                this.cep = ler.nextLine();
            }
            case 9 -> {
                System.out.print("Digite o novo endereço do paciente: ");
                this.endereco = ler.nextLine();
            }
            case 0 -> System.out.println("Saindo do menu de atualização...");
            default -> System.out.println("Opção inválida.");
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
            System.out.println("RG: " + this.rg);
            System.out.println("Telefone fixo: " + this.telFixo);
            System.out.println("Telefone móvel: " + this.telMovel);
            System.out.println("E-mail: " + this.email);
            System.out.println("CEP: " + this.cep);
            System.out.println("Endereço: " + this.endereco);
        } else {
            System.out.println("Paciente não encontrado!");
        }
        menu();
    }
    
    public void cadastrarPaciente() {

        System.out.println("Bem vindo ao consultorio preciso de algumas informações suas");
        Scanner ler = new Scanner(System.in);

        
        System.out.print("Qual é seu nome: ");
        nome = ler.next();

        System.out.print("Qual é sua Idade: ");
        idade = ler.nextInt();

        System.out.print("Qual é seu CPF: ");
        cpf = ler.nextLine();

        System.out.print("Qual é seu RG: ");
        rg = ler.nextLine();

        System.out.print("Qual é seu Telefone Fixo: ");
        telFixo = ler.nextLine();

        System.out.print("Qual é seu Telefone Movel: ");
        telMovel = ler.nextLine();

        System.out.print("Qual é seu Email: ");
        email = ler.next();

        System.out.print("Qual é seu CEP: ");
        cep = ler.nextLine();

        System.out.print("Qual é seu Endereco: ");
        endereco = ler.next();

        System.out.println("Paciente cadastrado com sucesso!");
        
        menu();
    }
        public void menu(){ 
        Scanner ler = new Scanner(System.in);
         for(int i=0;i<3;i++){
         String escolha;
        System.out.println("Escolha uma opção !");
        System.out.println("(0) Cadastrar Paciente\n(1) Atualizar Paciente\n(2) Pesquisar Paciente\n(3)Menu Principal");
        escolha = ler.next();
         switch (escolha) {
                case "0" -> cadastrarPaciente();
                case "1" -> atualizarPaciente();
                case "2" -> pesquisarPaciente();
                case "3" -> i=6;
         }

    }
        }
}
