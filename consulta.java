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
    public int[] codIdentificacao = new int[100];
    private double dosagem;
    private String instrucoes;
    private int quatidade;

    public consulta(String nomePaciente, String nomeMedico, int emissao, String nomeMedicamento, Date validade, String nomeComercial, int id, int codIdentificador, double dosagem, String instrucoes, int quatidade, String consulta) {
        this.validade = validade;
        this.nomeComercial = nomeComercial;
        this.id = id;
        this.dosagem = dosagem;
        this.instrucoes = instrucoes;
        this.quatidade = quatidade;
        this.consulta=consulta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodIdentificador() {
        return codIdentificador;
    }

    public void setCodIdentificador(int codIdentificador) {
        this.codIdentificador = codIdentificador;
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
                codIdentificador[i]=gerador.nextInt(99);
            }
        System.out.println("Sr(a)"+nomePaciente+" seu codigo gerado para identificar o medicamento ou caso precise cancelar é "+codIdentificador);      
    }
    }

    
    
    public void cancelarHorario(){
        Scanner ler = new Scanner(System.in);
        int codNovo=0;
        System.out.println("Para o cancelamento do seu horario precisamos confiramar alguns dados:");
        System.out.println("Qual é seu nome");
        nomePaciente = ler.next();
        System.out.println("Qual o seu codigo de identificador do medicamento");
        if(codIdentificador == codNovo){
            System.out.println("Seu horario foi cancelado!!!");
        }
    }
    
    public void menuu(){ 
        Scanner ler = new Scanner(System.in);
         String escolha;
        System.out.println("Oque voce gostaria de fazer, escolha uma das opçoes");
        System.out.println("(0)Agendar Horario\n(1)Cancelar Horario");
        escolha = ler.next();
         switch (escolha) {
                case "0":
                    agendarHorario();
                break;
                case "1":
                    cancelarHorario();
                break;
         }
    }
}
