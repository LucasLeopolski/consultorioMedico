/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.consultoriomedico;

import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class Paciente extends Pessoa {
    
     private int idPaciente;
    public Scanner ler;

    public Paciente() {
    
 ler = new Scanner(System.in);
    }

    public Paciente(int idPessoa, String nome, String sobrenome, int idade, char sexo, String cpf, String telefone, String email, String cep, String endereco) {
        super(idPessoa, nome, sobrenome, idade, sexo, cpf, telefone, email, cep, endereco);
        ler = new Scanner(System.in);
    }

    public void atualizarPaciente() {
        int opcao;

        do {
            exibirOpcoesAtualizacao();
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    atualizarNome();
                    break;
                case 2:
                    atualizarIdade();
                    break;
                case 3:
                    atualizarCpf();
                    break;
                case 4:
                    atualizarTelefone();
                    break;
                case 5:
                    atualizarEndereco();
                    break;
                case 0:
                    System.out.println("Saindo do menu de atualização...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        System.out.println("Dados do paciente atualizados com sucesso!");
        exibirMenu();
    }

    public void pesquisarPaciente() {
        System.out.print("Digite o CPF do paciente que deseja pesquisar: ");
        String cpfPesquisa = ler.nextLine();

        if (cpfPesquisa.equals(this.cpf)) {
            exibirInformacoesPaciente();
        } else {
            System.out.println("Paciente não encontrado!");
        }
        exibirMenu();
    }

    private void exibirInformacoesPaciente() {
        System.out.println("Paciente encontrado!");
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome:  " + this.sobrenome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone " + this.telefone);
        System.out.println("Endereço: " + this.endereco);
    }

    @Override
    public void cadastrarPaciente() {
        ler = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        nome = ler.nextLine();
        System.out.println("Informe seu sobrenome: ");
        sobrenome = ler.nextLine();
        System.out.println("Informe seu idade: ");
        idade = ler.nextInt();
        System.out.println("Informe seu telefone: ");
        telefone = ler.nextLine();
        System.out.println("Informe seu CPF: ");
        cpf = ler.nextLine();
        System.out.println("Informe seu endereço: ");
        endereco = ler.nextLine();
        System.out.println("Paciente cadastrado com sucesso!");
        exibirMenu();
    }

    private void exibirOpcoesAtualizacao() {
        System.out.println("Qual campo você deseja atualizar?");
        System.out.println("1 - Nome");
        System.out.println("2 - Idade");
        System.out.println("3 - CPF");
        System.out.println("4 - Telefone");
        System.out.println("7 - Endereço");
        System.out.println("0 - Sair");
    }

    private void atualizarNome() {
        System.out.print("Digite o novo nome do paciente: ");
        this.nome = ler.next();
    }

    private void atualizarIdade() {
        System.out.print("Digite a nova idade do paciente: ");
        this.idade = ler.nextInt();
    }

    private void atualizarCpf() {
        System.out.print("Digite o novo CPF do paciente: ");
        this.cpf = ler.next();
    }

    private void atualizarTelefone() {
        System.out.print("Digite o novo telefone do paciente: ");
        this.telefone = ler.nextLine();
    }

    private void atualizarEndereco() {
        System.out.print("Digite o novo endereço do paciente: ");
        ler.nextLine(); // Limpa o buffer do scanner antes de ler a próxima linha
        this.endereco = ler.nextLine();
    }

    public void exibirMenu() {
        for (int i = 0; i < 3; i++) {
            String escolha;
            System.out.println("Escolha uma opção!");
            System.out.println("(0) Cadastrar Paciente");
            System.out.println("(1) Atualizar Paciente");
            System.out.println("(2) Pesquisar Paciente");
            System.out.println("(3) Menu Principal");
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