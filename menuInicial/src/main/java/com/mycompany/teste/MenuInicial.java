package com.mycompany.teste;

//import java.util.Date;
import java.util.Scanner;

public class MenuInicial {
    
    public static void main(String[] args) {
        consulta con = new consulta();
        Scanner ler = new Scanner(System.in);
        //Date data = new Date();
        //Especialidades especialidade = new Especialidades(String.class, boolean.class, boolean.class, String.class, String.class, int.class, int.class, String.class, int.class, int.class);
        
        String menu; 
        
        for(int i = 0;i<3;i++){
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
                    for(int j = 0; j < 3; j++){
                        System.out.println("Voce escolheu ESPECIALIDADES!");
                        System.out.println("=============================");
                        System.out.println("Escolha o que deseja executar em ESPECIALIDADES conforme a tabela");
                        System.out.println("1 - ACESSAR FICHA");
                        System.out.println("2 - ACESSAR RELATÓRIO");
                        System.out.println("3 - HORA DISPONÍVEL");
                        System.out.println("4 - VOLTAR AO MENU INICIAL");
                        String codEspecialidades = ler.next();
                        switch (codEspecialidades) {
                            case "1":
                                System.out.println("especialidade.acessarFicha(); ");
                                //especialidade.acessarFicha();
                                j=99;
                                break;
                            case "2":
                                System.out.println("especialidade.acessarRelatorio();");
                                //especialidade.acessarRelatorio();
                                j=99;
                                break;
                            case "3":
                                System.out.println("especialidade.horaDisponivel()");
                                //especialidade.horaDisponivel();
                                j=99;
                                break;
                            case "4":
                                j=99;
                                break;   
                            default:
                                System.out.println("OPÇÃO INVÁLIDADE, TENTE NOVAMENTE!");
                                j=0;
                                break;
                        }
                    }
                    break;
                case "2":
                    System.out.println("Voce escolheu RECEITAS");
                    con.menuu();
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
                    i=0;
                    break;
            }
        }
    }
}

