/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.consultoriomedico;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
class paciente {
    public String[] nomePaciente = new String[100];
    public String[] cadastrarPaciente = new String[100];

    public String nome;
    public int idade;
    public char sexo;
    private int id;
    private int cpf;
    private int rg;
    private int telFixo;
    private int telMovel;
    private String email;
    private int cep;
    private String endereco;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(int telFixo) {
        this.telFixo = telFixo;
    }

    public int getTelMovel() {
        return telMovel;
    }

    public void setTelMovel(int telMovel) {
        this.telMovel = telMovel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
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

        System.out.print("Digite o novo nome do paciente: ");
        this.nome = ler.nextLine();

        System.out.print("Digite a nova idade do paciente: ");
        this.idade = ler.nextInt();

        System.out.print("Digite o novo CPF do paciente: ");
        this.cpf = ler.nextInt();

        System.out.print("Digite o novo RG do paciente: ");
        this.rg = ler.nextInt();

        System.out.print("Digite o novo telefone fixo do paciente: ");
        this.telFixo = ler.nextInt();

        System.out.print("Digite o novo telefone móvel do paciente: ");
        this.telMovel = ler.nextInt();

        System.out.print("Digite o novo e-mail do paciente: ");
        this.email = ler.nextLine();

        System.out.print("Digite o novo CEP do paciente: ");
        this.cep = ler.nextInt();

        System.out.print("Digite o novo endereço do paciente: ");
        this.endereco = ler.nextLine();

        System.out.println("Dados do paciente atualizados com sucesso!");

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
    }
    
    public void cadastrarPaciente() {

        System.out.println("Bem vindo ao consultorio preciso de algumas informações suas");
        Scanner ler = new Scanner(System.in);

        String nome = null;
        
        System.out.print("Qual é seu nome: ");
        nome = ler.next();

        System.out.print("Idade: ");
        int idade = ler.nextInt();

        System.out.print("CPF: ");
        int acpf = ler.nextInt();

        System.out.print("RG: ");
        int arg = ler.nextInt();

        System.out.print("Telefone Fixo: ");
        int telefoneFixo = ler.nextInt();

        System.out.print("Telefone Movel: ");
        int telefoneMovel = ler.nextInt();

        System.out.print("Email: ");
        String aemail = ler.next();

        System.out.print("CEP: ");
        int acep = ler.nextInt();

        System.out.print("Endereco: ");
        String aendereco = ler.next();

        System.out.println("Paciente cadastrado com sucesso!");

    }
}
