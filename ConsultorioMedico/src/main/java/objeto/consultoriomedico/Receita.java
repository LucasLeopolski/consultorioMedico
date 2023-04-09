/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.consultoriomedico;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Receita {
     public String[] nomePaciente = new String[100];

    public String[] nomeMedico = new String[100];
    
    public int[] emissao = new int[100];
    
    public String[] nomeMedicamento = new String[100];
    
    public int[] codIdentificacao = new int[100];
    
    public Date validade;
    public String nomeComercial;
    public String consulta;
    
    private int id;
    private double dosagem;
    private String instrucoes;
    private int quantidade;
    
    
    
    int terminouLoop;
    int codNovo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDosagem() {
        return dosagem;
    }

    public void setDosagem(double dosagem) {
        this.dosagem = dosagem;
    }

    public String getInstrucoes() {
        return instrucoes;
    }

    public void setInstrucoes(String instrucoes) {
        this.instrucoes = instrucoes;
    }

    public int getQuatidade() {
        return quantidade;
    }

    public void setQuatidade(int quatidade) {
        this.quantidade = quatidade;
    }
    
    public void agendarHorario(){
        
        for(int c = 0;c<100;c++){
        terminouLoop=c;    
        
        System.out.println("Precisamos de alguns dados para agendar um horario para retirar seus medicamentos");
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual seu nome:");
        nomePaciente[c] = ler.next();
        System.out.println("Qual o nome do medico que deu a receita para voce:");
        nomeMedico[c] = ler.next();
        System.out.println("A quantos dias foi dado essa receita a voce:");
        emissao[c] = ler.nextInt();
        System.out.println("Qual seria o medicamento:");
        nomeMedicamento[c] = ler.next();
         for( int i = 0;i < 1000;i++){
             Random gerador = new Random();
                codIdentificacao[c]=gerador.nextInt(99);
            }
        String escolha;
        System.out.println("Sr(a)" +nomePaciente[c]+" seu codigo gerado para identificar o medicamento ou caso precise cancelar é "+codIdentificacao[c]);
            System.out.println("(0)Agendar outro paciente\n(1)Voltar para o menu");
            escolha = ler.next();
             switch (escolha) {
                case "0":
                    c=terminouLoop;
                break;
                case "1":
                    menuu();
                break;
                case "2":
                    marcados();
                break;
    }
    }
    }
   public void marcados(){
       for(int i = 0;i<terminouLoop+1;i++){
            System.out.println("Pessoas agendadas!!!\n");
            System.out.println("Nome: "+nomePaciente[i]);
            System.out.println("Medico: "+nomeMedico[i]);
            System.out.println("Tempo da receita: "+emissao[i]+" dias");
            System.out.println("Medicamento: "+nomeMedicamento[i]);
            System.out.println("\n============================================\n");
        }
       menuu();
   }

    
    
    public void cancelarHorario(){
        Scanner ler = new Scanner(System.in);
        
        for(int i = 0;i<100;i++){
        System.out.println("Para o cancelamento do seu horario precisamos confiramar alguns dados:");
        System.out.println("Qual é seu nome");
        nomePaciente[i] = ler.next();
        System.out.println("Qual o seu codigo de identificador");
        codNovo = ler.nextInt();
        if(codIdentificacao[i] == codNovo){
            System.out.println("Seu horario foi cancelado "+nomePaciente[i]+" !!!");
            nomePaciente[i]="";
            nomeMedico[i]=""; 
            emissao[i]=0;
            nomeMedicamento[i]="";
            menuu();
        }else{
            System.out.println("Erro!!!");
            
        }
    }
    }
    
    public void lembrete(){
        
        Random gerar = new Random();
        quantidade=gerar.nextInt(1)+6;
        dosagem=gerar.nextInt(2)+2;
        int validade = gerar.nextInt(10)+30;
        System.out.println("O seu medicamento deve ser tomado "+dosagem+" ml/g por dia durante "+quantidade+" dias \n e tome cuidado com a validade que é de "+validade+ " dias!!!");
        menuu();
    }
    
    public void menuu(){ 
        Scanner ler = new Scanner(System.in);
         for(int i=0;i<3;i++){
         String escolha;
        System.out.println("Oque voce gostaria de fazer, escolha uma das opçoes");
        System.out.println("(0)Agendar Horario\n(1)Cancelar Horario\n(2)Mandar um lembrete\n(3)Pessoas Agendadas\n(4)Menu Principal");
        escolha = ler.next();
         switch (escolha) {
                case "0":
                    agendarHorario();
                break;
                case "1":
                    cancelarHorario();
                break;
                case "2":
                    lembrete();
                break;
                case "3":
                    marcados();
                break;
              case "4":
                   i=6;
                break;
         }
         }
    }
}
