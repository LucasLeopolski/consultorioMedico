package objeto.consultoriomedico;

import java.util.Scanner;

public class ConsultorioMedico {

    public static void main(String[] args) {
        
        boolean entrarFuncionario = false;
        Receita receita = new Receita();
        paciente Paciente = new paciente();
        Scanner ler = new Scanner(System.in);
        boolean sair = false;
        String usuario = "suporte";
        String senha = "suporte@";
        
        System.out.println("Você é um funcionário? (y/n)");
        String resposta = ler.nextLine();
        
        if(resposta.equalsIgnoreCase("y")){
            System.out.println("Informe seu usuario: ");
            String usuarioInformado = ler.nextLine();
            System.out.println("Informe sua senha:");
            String senhaInformada = ler.nextLine();
            if(usuarioInformado.equals(usuario) && senhaInformada.equals(senha)){
                entrarFuncionario = true;
            }else{
                System.out.println("Senha inválida... Continuando como paciente");
            }
        }else{
            System.out.println("Entrando como paciente...");
        }
        while (!sair) {
            if(entrarFuncionario == true){
                System.out.println("\nBem vindo(a) ao Medic Softwares! No que podemos lhe ajudar!");
                System.out.println("(1)Agendamento de consultas\n(2)Especialidades\n(3)Receitas\n(4)Paciente\n(5)Funcionario\n(6)Financeiro\n(0)Sair");
                String menu = ler.nextLine();
                switch (menu) {
                    case "1" -> {
                        System.out.println("Voce escolheu Agendamento de Consulta");
    //                    agendamento.agendarHorario();
                    }
                    case "2" -> {
                        System.out.println("Voce escolheu Especialidades!");
    //                    especialidade.menu();
                    }
                    case "3" -> {
                        System.out.println("Voce escolheu Receitas");
                        receita.menu();
                    }
                    case "4" -> {
                        System.out.println("Voce escolheu Paciente");
                        Paciente.menu();
                    }
                    case "5" -> {
                        System.out.println("Voce escolheu Funcionario");
                        MenuFuncionario menuFuncionario = new MenuFuncionario();
                        menuFuncionario.exibirMenu();
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
                        System.out.println("OPÇÃO INVALIDA!! TENTE NOVAMENTE\n\n====================================================");
                    }
                }   
            }else{
                System.out.println("\nBem vindo(a) ao Medic Softwares! No que podemos lhe ajudar!");
                System.out.println("(1)Agendamento de consultas\n(2)Especialidades\n(3)Financeiro\n(0)Sair");
                String menu = ler.nextLine();
                switch(menu){
                    case "1" -> {
                        System.out.println("Voce escolheu Agendamento de Consulta");
    //                    agendamento.agendarHorario();
                    }
                    case "2" -> {
                        System.out.println("Voce escolheu Especialidades!");
    //                    especialidade.menu();
                    }
                    case "3" -> {
                        System.out.println("Voce escolheu Financeiro");
                        Financeiro financeiro = new Financeiro();                          
                        financeiro.pagarConsulta();
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
}
