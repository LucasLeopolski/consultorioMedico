package com.mycompany.teste;

import java.util.Scanner;

public class MenuInicial {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        String menu; 
        
        for(int i = 0;i<100;i++){
            System.out.println("\nBem vindo(a) ao Medic Softwares! No que podemos lhe ajudar!");
            System.out.println("(0)Agendamento de consultas\n(1)Especialidades\n(2)Receitas\n(3)Paciente\n(4)Cadastrar Funcionario\n(5)Financeiro\n(6)Sair");
            menu = ler.next();
            
            switch (menu) {
                case "0":
                    System.out.println("Voce escolheu AGENDAMENTO DE CONSULTA");
                    i=99;
                    //agendamento();
                    break;
                case "1":
                    System.out.println("Voce escolheu ESPECIALIDADES!");
                    i=99;
                    break;
                case "2":
                    System.out.println("Voce escolheu RECEITAS");
                    i=99;
                    break;
                case "3":
                    System.out.println("Voce escolheu PACIENTE");
                    i=99;
                    break;
                case "4":
                    System.out.println("Voce escolheu CADASTRAR FUNCIONARIO");
                    i=99;
                    break;
                case "5":
                    System.out.println("Voce escolheu FINANCEIRO");
                    i=99;
                    break;
                case "6":
                    System.out.println("Sair");
                    i=99;
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA!! TENTE NOVAMENTE\n\n====================================================");    
                    break;
            }
        }
    }
}

