package objeto.consultoriomedico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Financeiro {
    
    public  String nomeTitular;
    public double valor;

    public double saldo;
    public double taxaJuro;
    public int numConta;
    public String tipoConta;
    public int dtAbertura;
    public int dtFechamento;
    public List<String> historicoTransacao;
    public double limiteCredito;

    public Financeiro(String nomeTitular, double valor, double taxaJuro, int numConta, String tipoConta, int dtAbertura, double limiteCredito) {
        this.nomeTitular = nomeTitular;
        this.valor = valor;
        this.saldo = valor;
        this.taxaJuro = taxaJuro;
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.dtAbertura = dtAbertura;
        this.historicoTransacao = new ArrayList<>();
        this.limiteCredito = limiteCredito;
    }

    Financeiro() {
    }

    public void depositarDinheiro() {
        Scanner dinheiro = new Scanner(System.in);
        int deposito = dinheiro.nextInt();
        System.out.println("Foi realizado um depósito de R$" + deposito);
    }

    public void sacarDinheiro() {
        Scanner dinheiro = new Scanner(System.in);
        int deposito = dinheiro.nextInt();
        System.out.println("Foi realizado um saque de R$" + deposito);
    }
    public void calcularJuros() {
        Scanner dinheiro = new Scanner(System.in);
        int juros = dinheiro.nextInt();  
        double calculojuros =  juros * 1.01;
         System.out.println("O valor de juros é: "+calculojuros); 
    }
    public void historicoTransacao(){
        ArrayList<String> historico = new ArrayList<String>();
        
        historico.add("Dia 13/01/2023 foi realizado um saque de R$ 190,00");
        historico.add("---------------------------------------------------");
        historico.add("Dia 30/03/2023 foi realizado um depósito de R$ 1000,00");
        historico.add("---------------------------------------------------");
        historico.add("Dia 14/04/2023 foi realizado um saque de R$ 190,00");
        historico.add("---------------------------------------------------");
        historico.add("Dia 20/06/2023 foi realizado um saque de R$4000,00");
        
        for (String h: historico){
        System.out.println(historico);
        }
    }
    public void menu(){
        
        Scanner ler = new Scanner(System.in);
     
        System.out.println("=============================");
        System.out.println("Escolha o que deseja executar em Financeiro conforme a tabela");
        System.out.println("1 - Depositar Dinheiro");
        System.out.println("2 - Sacar Dinheiro");
        System.out.println("3 - Juros");
        System.out.println("4 - Histórico de Transação");
        System.out.println("5 - Sair");
            
        
        int opcao = ler.nextInt();
        
        switch (opcao) {
            case 1 -> {
                System.out.println("Você escolheu Depositar Dinheiro ");
                System.out.println("Digite o valor que deseja depositar");
                depositarDinheiro();
            }
            case 2 -> {
                System.out.println("Você escolheu Sacar Dinheiro;");
                System.out.println("Digite o valor que deseja sacar");
                sacarDinheiro();
            }
            case 3 -> {
                System.out.println("Você escolheu Juros");
                System.out.println("O juros é de 1%");
                System.out.println("Digite o valor que deseja consultar");
                calcularJuros();
            }
             case 4 -> {
                System.out.println("Você escolheu Histórico de Transação");
                historicoTransacao();
            }
            default ->
                System.out.println("OPÇÃO INVÁLIDA TENTE NOVAMENTE!");
        }
    }          
}

