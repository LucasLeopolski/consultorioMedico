package objeto.consultoriomedico;

import java.util.Scanner;

public class ConsultorioMedico {

    public static void main(String[] args) {

        Receita receita = new Receita();
        Especialidades especialidade = new Especialidades();
        Agendamento agendamento = new Agendamento();
        Paciente paciente = new Paciente();
        Scanner ler = new Scanner(System.in);
        boolean sair = false;
        
        while (!sair) {
            System.out.println("\nBem vindo(a) ao Medic Softwares! No que podemos lhe ajudar!");
            System.out.println("(1)Agendamento de consultas\n(2)Especialidades\n(3)Receitas\n(4)Paciente\n(5)Funcionario\n(6)Financeiro\n(0)Sair");
            String menu = ler.nextLine();

            switch (menu) {
                case "1" -> {
                    System.out.println("Voce escolheu Agendamento de Consulta");
                    agendamento.agendarHorario();
                }
                case "2" -> {
                    System.out.println("Voce escolheu Especialidades");
                    especialidade.menu();
                }
                case "3" -> {
                    System.out.println("Voce escolheu Receitas");
                    receita.menu();
                }
                case "4" -> {
                    System.out.println("Voce escolheu Paciente");
                    paciente.menu();
                }
                case "5" -> {
                    System.out.println("Voce escolheu Funcionário");
                    Funcionario.menu();
                }
                case "6" -> {
                    System.out.println("Voce escolheu Financeiro");
                    Financeiro financeiro = new Financeiro();                          
                    financeiro.menu();
                }
                case "0" -> {
                    System.out.println("Sair");
                    sair = true;
                }
                default -> {
                    System.out.println("Opção Inválida!! Tente Novamente\n\n====================================================");
                }
            }
        }
    }
}
