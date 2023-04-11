/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agendamento;


import java.util.Scanner;

public class Agendamento {
    public String nome;
    public String telefone;
    public String sexo;
    public int idade;
    public String endereco;
    public String especialidade;
    public String medico;
    private boolean lembrete;
    private String dia;
    private String hora;

    public void agendarHorario() {
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("Agendando horário para " + nome);
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("Dia (dd/mm/aaaa): ");
        System.out.println("----------------------------------");
        dia = sc.nextLine();
        System.out.println("----------------------------------");
        System.out.println("Hora (hh:mm): ");
        System.out.println("----------------------------------");
        hora = sc.nextLine();
        System.out.println("----------------------------------");
        System.out.println("Horário agendado com sucesso!");
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

    public void marcarConsulta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marcação de consulta médica");
        System.out.println("===========================");
        System.out.print("Digite o nome completo: ");
        nome = sc.nextLine();
        System.out.print("Telefone: ");
        telefone = sc.nextLine();
        System.out.print("Sexo: ");
        sexo = sc.nextLine();
        System.out.print("Idade: ");
        idade = sc.nextInt();
        sc.nextLine(); // Limpar buffer do teclado
        System.out.print("Endereço: ");
        endereco = sc.nextLine();
        System.out.print("Digite a especialidade da consulta: ");
        especialidade = sc.nextLine();
        System.out.print("Digite o nome do Médico: ");
        medico = sc.nextLine();
        
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("                                  ");
        System.out.println("----------------------------------");
        
        System.out.println("Deseja habilitar lembrete? (S/N): ");
        System.out.println("----------------------------------");
        
        String opcao = sc.nextLine();
        lembrete = opcao.equalsIgnoreCase("S");
        agendarHorario();
        
    
        
        while (true) {
            System.out.println("Deseja marcar outra consulta? (S/N): ");
            opcao = sc.nextLine();
            if (opcao.equalsIgnoreCase("S")) {
                marcarConsulta();
                System.out.println("----------------------------------");
            } else {
                break;
            }
        }
    }
    
     public void menu2(){ 
        Scanner ler = new Scanner(System.in);
        for(int i=0;i<3;i++){
         String escolha;
        System.out.println("Escolha uma opção !");
        System.out.println("(0) Marcar Consulta\n(1) Agendar Horario\n(2) Cancelar Horario\n(3)Lembrar Horario \n(4)Menu Principal");
        escolha = ler.next();
         switch (escolha) {
                case "0" -> marcarConsulta();
                case "1" -> agendarHorario();
                case "2" -> cancelarHorario();
                case "3" -> lembrarHorario();
                case "4" -> i=6;
        
         }
        }
     }
    public static void main(String[] args) {
        Agendamento consulta = new Agendamento();
        consulta.marcarConsulta();
    }
}


