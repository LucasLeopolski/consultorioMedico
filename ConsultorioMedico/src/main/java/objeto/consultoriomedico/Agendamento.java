/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package objeto.consultoriomedico;

import java.util.Scanner;
import java.util.Random;

public class Agendamento {

    // ajustado no padrão Camel Case
    public String nome;
    public String telefone;
    public String sexo;
    public int idade;
    public String endereco;
    public String especialidade;
    public String medico;

    private int idAgendamento;
    private boolean lembrete;
    private String dia;
    private String hora;

    public Agendamento(String nome, String telefone, String sexo, int idade, String endereco, String especialidade, String medico, int idAgendamento, boolean lembrete, String dia, String hora) {
        this.nome = nome;
        this.telefone = telefone;
        this.sexo = sexo;
        this.idade = idade;
        this.endereco = endereco;
        this.especialidade = especialidade;
        this.medico = medico;
        this.idAgendamento = idAgendamento;
        this.lembrete = lembrete;
        this.dia = dia;
        this.hora = hora;
    }

    public int getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(int aIdAgendamento) {
        this.idAgendamento = aIdAgendamento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String aTelefone) {
        this.telefone = aTelefone;

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String aEndereco) {
        this.endereco = aEndereco;

    }

    public void agendarHorario() {

        System.out.println("\nVocê optou por agendar uma consulta! Informe os seus dados");
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nID do agendamento: ");
        this.idAgendamento = random.nextInt(1000);
        System.out.println(idAgendamento);
        System.out.print("\nDigite o seu nome completo: ");
        nome = sc.nextLine();
        System.out.print("\nInforme seu telefone: ");
        telefone = sc.nextLine();
        System.out.print("\nInforme seu sexo: ");
        sexo = sc.nextLine();
        System.out.print("\nQual sua idade? ");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Informe seu endereço: ");
        endereco = sc.nextLine();
        System.out.print("\nQual a especialidade você necessita? ");
        especialidade = sc.nextLine();
        System.out.print("\nCerto\n\n Agora informe com qual medico deseja fazer a consulta: ");
        medico = sc.nextLine();
        System.out.println("Informe o dia que deseja: ");
        dia = sc.nextLine();
        System.out.println("Certo, qual o horário: ");
        hora = sc.nextLine();
        System.out.println("\nDeseja habilitar lembrete? (S/N): ");
        String opcao = sc.nextLine();
        if (opcao == "S") {
            lembrete = opcao.equalsIgnoreCase("S");
            System.out.println("Lembrete adicionado!");
        } else if (opcao == "N") {
            System.out.println("Você optou por não receber um lembrete. ");

        } else {

            System.out.println("Escolha apenas entre S (sim) e N (não)");
        }
        System.out.println("\nSua consulta está agendada, escolha o próximo passo: \n");
        System.out.println(" [1] Marcar outra consulta      [2] Cancelar Consulta      [3] Visualizar Agendamento     [4] Sair");
        
        int escolha = sc.nextInt();

        switch (escolha) {

            case 1:
                agendarHorario();
                break;

            case 2:
                cancelarHorario();
                break;

            case 3:
                verConsulta();
                break;

            case 4:
                System.exit(0);
                break;

            default:
                System.out.println("Escolha apenas números entre 1 e 4. ");

        }

    }

    public void cancelarHorario() {
        System.out.println("Cancelando horário para " + nome);
        dia = null;
        hora = null;
        System.out.println("Horário cancelado com sucesso!");
    }

    public void lembrarHorario() {
        if (lembrete) {
            System.out.println("Lembrete: você tem uma consulta marcada para o dia " + dia + " às " + hora);
        } else {
            System.out.println("Lembrete não está habilitado para essa consulta.");
        }
    }

    public void verConsulta() {
        System.out.println("================Consulta:" + idAgendamento + "================");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade " + idade);
        System.out.println("Endereço " + endereco);
        System.out.println("Especialidade da consulta" + especialidade);
        System.out.println("Nome do Médico: " + medico);

    }
}
