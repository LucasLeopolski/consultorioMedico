package objeto.consultoriomedico;

import java.util.Random;
import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * Dev antigo: Matheus Schmidt
 * Dev novo: Lucas Pessoli
 */
public class Receita{
    private String nomeMedicamento;
    private int validadeDias;
    private int quantidade;
    private int dosagemEmHoras;

    public int getValidadeDias() {
        return validadeDias;
    }

    public void setValidadeDias(int validadeDias) {
        this.validadeDias = validadeDias;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getDosagemEmHoras() {
        return dosagemEmHoras;
    }

    public void setDosagemEmHoras(int dosagemEmHoras) {
        this.dosagemEmHoras = dosagemEmHoras;
    }
    

    public int getQuatidade() {
        return quantidade;
    }

    public void setQuatidade(int quatidade) {
        this.quantidade = quatidade;
    }
    
    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }
    
    public String gerarData(boolean resposta){
        String data;
        if(resposta == true){ //retornará a data atual
            Random random = new Random();
            int dia = random.nextInt(365);
            int mes = random.nextInt(12) + 1;
            Calendar calendario = Calendar.getInstance();
            data = calendario.getTime().toString();   
        }else{
            Random random = new Random(); //retorna uma data randomizada
            int dia = random.nextInt(365);
            int mes = random.nextInt(12) + 1;
            Calendar calendario = Calendar.getInstance();
            calendario.set(Calendar.YEAR, 2023);
            calendario.set(Calendar.MONTH, mes - 1);
            calendario.set(Calendar.DAY_OF_MONTH, 1);
            calendario.add(Calendar.DAY_OF_MONTH, dia);
            data = calendario.getTime().toString();
        }
        return data;
    }

    public void lembreteHorario() {
        Random gerar = new Random();
        quantidade = gerar.nextInt(1) + 6;
        dosagemEmHoras = gerar.nextInt(2) + 2;
        System.out.println("O seu medicamento: "+ getNomeMedicamento() + "\nDeve ser tomado em: " + gerarData(false) + "\nDurante " + quantidade + " dias.");
        menu();
    }

    public void cadastrarReceita(){
        for(int i=0;i<50;i--){
            System.out.println("Informe qual tarja pertence o seu remédio: preta/vermelha/amarela");
            Scanner ler = new Scanner(System.in);
            String tarja = ler.nextLine();
            if(tarja.equalsIgnoreCase("preta")){
                setDosagemEmHoras(24);
                setValidadeDias(30);
            }
            if(tarja.equalsIgnoreCase("vermelha")){
                setDosagemEmHoras(16);
                setValidadeDias(30);
            }
            if(tarja.equalsIgnoreCase("amarela")){
                setDosagemEmHoras(8);
                setValidadeDias(30);
            }
            System.out.println("#Informe o nome medicamento:");
            setNomeMedicamento(ler.nextLine());
            System.out.println("Receita cadastrada com sucesso.");
            emitirReceita();
            System.out.println("Você deseja voltar ao menu? (y/n)");
            String resposta = ler.nextLine();
            if(resposta.equalsIgnoreCase("y")){
                i=52;
            }
        }
    }
    
    public void emitirReceita(){
        System.out.println("A receita é:");
        System.out.println("O nome do medicamento é: " + getNomeMedicamento());
        System.out.println("A dosagem em horas é: " + getDosagemEmHoras());
        System.out.println("A validade é de: " + getValidadeDias() + " dias");
        System.out.println("Data emitida: " + gerarData(true));
    }

    public void menu() {
        Scanner ler = new Scanner(System.in);
        boolean encerraLacoRepeticao = false;
        while(!encerraLacoRepeticao){
            System.out.println("Escolha uma das seguintes opções:\n[1] - Cadastrar receita\n[2] - Lembrete de Horário\n[3] - Menu Principal");
            String escolha = ler.next();
            switch (escolha) {
                case "1":
                    cadastrarReceita();
                    break;
                case "2":
                    lembreteHorario();
                    break;
                case "3":
                    encerraLacoRepeticao = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
