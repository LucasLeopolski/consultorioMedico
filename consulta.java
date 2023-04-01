/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.consultoriomedicooo;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Windows
 */
public class consulta {
    public String[] nomePaciente = new String[100];

    public String[] nomeMedico = new String[100];
    
    public int[] emissao = new int[100];
    
    public String[] nomeMedicamento = new String[100];
    
    public Date validade;
    public String nomeComercial;
    public String consulta;
    
    private int id;
    public int codIdentificacao;
    private double dosagem;
    private String instrucoes;
    private int quatidade;
    
    
    
    int terminouLoop=0;
    int codNovo=0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodIdentificacao() {
        return codIdentificacao;
    }

    public void setCodIdentificacao(int codIdentificacao) {
        this.codIdentificacao = codIdentificacao;
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
        return quatidade;
    }

    public void setQuatidade(int quatidade) {
        this.quatidade = quatidade;
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
        System.out.println("Quando foi dado essa receita a voce:");
        emissao[c] = ler.nextInt();
        System.out.println("Qual seria o medicamento:");
        nomeMedicamento[c] = ler.next();
         for( int i = 0;i < 1000;i++){
             Random gerador = new Random();
                codIdentificacao=gerador.nextInt(99);
            }
        String escolha;
        System.out.println("Sr(a)"+nomePaciente[c]+" seu codigo gerado para identificar o medicamento ou caso precise cancelar é "+codIdentificacao);
            System.out.println("(0)Agendar outro paciente\n(1)Voltar para o menu\n(2)Pessoas Agendadas");
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
            System.out.println("Tempo da receita: "+emissao[i]);
            System.out.println("Medicamento: "+nomeMedicamento[i]);
            System.out.println("\n============================================\n");
        }
   }

    
    
    public void cancelarHorario(){
        Scanner ler = new Scanner(System.in);
        
        for(int i = 0;i<100;i++){
        System.out.println("Para o cancelamento do seu horario precisamos confiramar alguns dados:");
        System.out.println("Qual é seu nome");
        nomePaciente[i] = ler.next();
        System.out.println("Qual o seu codigo de identificador");
        codNovo = ler.nextInt();
        if(codIdentificacao == codNovo){
            System.out.println("Seu horario foi cancelado "+nomePaciente[i]+" !!!");
        }else{
            System.out.println("Erro!!!");
        }
    }
    }
    
    public void lembrete(){
        int vezes;
        int dias;
        Random gerar = new Random();
        dias=gerar.nextInt(1)+6;
        vezes=gerar.nextInt(2)+2;
        System.out.println("O seu medicamento deve ser tomado "+vezes+" vezes por dia durante "+dias+" dias!!!");
    }
    
    public void menuu(){ 
        Scanner ler = new Scanner(System.in);
         String escolha;
        System.out.println("Oque voce gostaria de fazer, escolha uma das opçoes");
        System.out.println("(0)Agendar Horario\n(1)Cancelar Horario\n(2)Mandar um lembrete");
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
         }
    }
}
