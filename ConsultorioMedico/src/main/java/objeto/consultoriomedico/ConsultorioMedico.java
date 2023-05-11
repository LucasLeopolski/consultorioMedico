package objeto.consultoriomedico;

import java.util.Scanner;

public class ConsultorioMedico {

    public static void main(String[] args) {

        Receita receita = new Receita();
        Especialidades especialidade = new Especialidades();
        Agendamento agendamento = new Agendamento();
        paciente Paciente = new paciente();
        Scanner ler = new Scanner(System.in);
        boolean sair = false;
        while (!sair) {
            System.out.println("\nBem vindo(a) ao Medic Softwares! No que podemos lhe ajudar!");
            System.out.println("(1)Agendamento de consultas\n(2)Especialidades\n(3)Receitas\n(4)Paciente\n(5)Funcionario\n(6)Financeiro\n(0)Sair");
            String menu = ler.nextLine();

            switch (menu) {
                case "1" -> {
                    System.out.println("Voce escolheu AGENDAMENTO DE CONSULTA");
                    agendamento.agendarHorario();
                }
                case "2" -> {
                    System.out.println("Voce escolheu ESPECIALIDADES!");
                    especialidade.menu();
                }
                case "3" -> {
                    System.out.println("Voce escolheu RECEITAS");
                    receita.menu();
                }
                case "4" -> {
                    System.out.println("Voce escolheu PACIENTE");
                    Paciente.menu1();
                }
                case "5" -> {
                    System.out.println("Voce escolheu FUNCIONARIO");
                    Funcionario.menu();
                }
                case "6" -> {
                    System.out.println("Voce escolheu FINANCEIRO");
                }
                case "0" -> {
                    System.out.println("Sair");
                    sair = true;
                }
                default -> {
                    System.out.println("OPÇÃO INVALIDA!! TENTE NOVAMENTE\n\n====================================================");
                }
            }
        }
    }
}
