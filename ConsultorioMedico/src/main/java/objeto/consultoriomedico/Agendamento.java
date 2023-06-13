/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*
*@author Lucas Leopolski
 */

package objeto.consultoriomedico;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Agendamento {

    CadastroEspecialidade espcialidade = new CadastroEspecialidade();

    Datas datas = new Datas();

    Scanner sc = new Scanner(System.in);

    public String nomeCompleto;
    public String telefone;
    public String sexo;
    public int idade;
    public String endereco;
    public int especialidadeDesejada;
    private int idAgendamento;

    String dia = datas.gerarData(false);

    public Agendamento() {
    }

    public Agendamento(String nome, String telefone, String sexo, int idade, String endereco, int especialidadeDesejada, int idAgendamento, boolean lembrete) {
        this.nomeCompleto = nome;
        this.telefone = telefone;
        this.sexo = sexo;
        this.idade = idade;
        this.endereco = endereco;
        this.especialidadeDesejada = especialidadeDesejada;
        this.idAgendamento = idAgendamento;

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

        System.out.println("\n Informe os seus dados");
        Random random = new Random();

        System.out.println("\nID do agendamento: ");
        this.idAgendamento = random.nextInt(1000);
        System.out.println(idAgendamento);
        System.out.print("\nDigite o seu nome completo: ");
        nomeCompleto = sc.nextLine();
        System.out.print("\nInforme seu telefone: ");
        telefone = sc.nextLine();
        System.out.print("\nInforme seu sexo: ");
        sexo = sc.nextLine();
        System.out.print("\nQual sua idade? ");
        idade = sc.nextInt();
        sc.nextLine();
        System.out.print("\nInforme seu endereço: ");
        endereco = sc.nextLine();
        System.out.print("\nInforme a especialidade você necessita: ");
        System.out.println(espcialidade.cadastrarEspecialidades());
        especialidadeDesejada = sc.nextInt();

        ArrayList<String> lista = new ArrayList<>();
        lista = espcialidade.cadastrarEspecialidades();

        switch (especialidadeDesejada) {
            case 1:
                System.out.println(lista.get(1));

                break;

        }
        System.out.println("Informe o dia que deseja: ");

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
        System.out.println("Cancelando horário para " + nomeCompleto);
        System.out.println("Horário cancelado com sucesso!");
    }

    public void verConsulta() {
        System.out.println("================Consulta:" + idAgendamento + "================");
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Telefone: " + telefone);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade " + idade);
        System.out.println("Endereço " + endereco);
        System.out.println("Especialidade da consulta" + especialidadeDesejada);
        System.out.println("Data: " + dia);

    }
}
