/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package objeto.consultoriomedico;



import java.util.Scanner;
import java.util.Random;
public class Agendamento {

 
    public String nome;
    public String Telefone;
    public String sexo;
    public int idade;
    public String Endereco;
    public String especialidade;
    public String medico;

    private int IdAgendamento;
    private boolean lembrete;
    private String dia;
    private String hora;

    public int getIdAgendamento() {
        return IdAgendamento;
    }

    public void setIdAgendamento(int id) {
        this.IdAgendamento = IdAgendamento;
    }

    public String getTelefone() {
        return Telefone;
    }

    public String setTelefone() {
        this.Telefone = Telefone;
        return null;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String setEnderecoe() {
        this.Endereco = Endereco;
        return null;
    }

    public void agendarHorario() {

        System.out.println("\nAgendando horário para " + nome);
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
        System.out.println("Horário agendado com sucesso!\n");
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
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Marcação de consulta médica");
        System.out.println("===========================");
        System.out.println("\nID do agendamento: ");
        this.IdAgendamento = random.nextInt(1000);
        System.out.println(IdAgendamento);
        
        System.out.print("\nDigite o nome completo: ");
        nome = sc.nextLine();
      
        System.out.print("\nTelefone: ");
        Telefone = sc.nextLine();
        System.out.print("\nSexo: ");
        sexo = sc.nextLine();
        System.out.print("\nIdade: ");
        idade = sc.nextInt();
        sc.nextLine(); // Limpar buffer do teclado
        System.out.print("\nEndereço: ");
        Endereco = sc.nextLine();
        System.out.print("\nDigite a especialidade da consulta: ");
        especialidade = sc.nextLine();
        System.out.print("\nDigite o nome do Médico: ");
        medico = sc.nextLine();
    
        System.out.println("\n----------------------------------");
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
        
        System.out.println("\n----------------------------------");
        System.out.println("Deseja ver a consulta marcada?\nDigite 1 para sim e 2 para não: ");
        System.out.println("----------------------------------");
        int opcao1 = sc.nextInt();
        if (opcao1 == 1) {
        verConsulta();
        } else if(opcao1 == 2){
            
        }else{
            System.out.println("A opção informada não existe");
        }
        
        
            System.out.println("\nDeseja marcar outra consulta? (S/N): ");
            String opcao3 = sc.next();
            if (opcao3.equalsIgnoreCase("S")) {
                marcarConsulta();
                System.out.println("----------------------------------");
            } else {
                
            }
        
            System.out.println("\n----------------------------------");
        System.out.println("Deseja cancelar o horario da consulta marcada?\nDigite 1 para sim e 2 para não: ");
        System.out.println("----------------------------------");
        int opcao5 = sc.nextInt();
        if (opcao5 == 1) {
        cancelarHorario();
        } else if(opcao1 == 2){
            
        }else{
            System.out.println("A opção informada não existe");
        }
            
        
      
    }

    public void verConsulta(){
        
        
        System.out.println("================Consulta:" +IdAgendamento + "+======= =======");
        System.out.println("ID do agendamento: " + IdAgendamento);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + Telefone);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade " + idade);
        System.out.println("Endereço " +Endereco);
        System.out.println("Especialidade da consulta" + especialidade);
        System.out.println("Nome do Médico: " +medico);
            
        }
    
    
    
    
    public void menu2() {
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String escolha;
            System.out.println("Escolha uma opção !");
            System.out.println("\n(0) Marcar Consulta \n(1)Menu Principal");
            escolha = ler.next();
            switch (escolha) {
                case "0" ->
                    marcarConsulta();
                case "1" ->
                   i = 1;


            }
        }
    }

    public static void main(String[] args) {
        
        Agendamento consulta = new Agendamento();
        consulta.marcarConsulta();

    }

    
        }
    

