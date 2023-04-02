package objeto.consultoriomedico;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Maria
 */
public class Especialidades {
    int crmMedico = 0;
    
    public String especializacao;
    public boolean cirurBem; /*sera solicitado a possibilidade de mudança de tipo da variável com o analista(mas só sera feita alteração pós entrega)*/
    public boolean cirurMal; /*sera solicitado a possibilidade de mudança de tipo da variável com o analista(mas só sera feita alteração pós entrega)*/
    public String formacao;
    public String areaAtuacao;
    private int crm;
    private int telefone;
    private Date dataNascimento; /*sera solicitado a possibilidade de mudar pra String pra ser possível o cadastro(mas só sera feita alteração pós entrega)*/
    private int horaEntrada;
    private int horaSaida;

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }
    
    public void acessarFicha(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o CRM do(a) médico(a) que deseja acessar a ficha:");
        crmMedico = ler.nextInt();
   
            if ( crmMedico == crm){
                System.out.println("==========DADOS DO(A) DOUTOR(A)==========");
                System.out.println("CRM........................."+crm);
                System.out.println("AREA DE ATUACAO............."+areaAtuacao);
                System.out.println("ESPECIALIDADE..............."+especializacao);
                System.out.println("FORMACAO...................."+formacao);
                System.out.println("TELEFONE...................."+telefone);
                System.out.println("DATA DE NASCIMENTO ........."+dataNascimento);
                System.out.println("HORARIO DE ENTRADA/SAIDA...."+horaEntrada+" / "+horaSaida);
            }else{
                System.out.println("CRM INVÁLIDO!");
            }
    }
    public void acessarRelatorio(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe CRM do(a) médico(a) que deseja ver o relatório:");
        crmMedico = ler.nextInt();
   
            if ( crmMedico == crm){
                System.out.println("================RELATÓRIO================");
                System.out.println("CRM........................."+crm);
                System.out.println("AREA DE ATUACAO............."+areaAtuacao);
                System.out.println("ESPECIALIDADE..............."+especializacao);
                //System.out.println("QUANTIDADE DE CIRUGIAS BEM SUCEDIDAS"+cirurBem);
                //System.out.println("TOTAL DE CIRUGIAS..........."+(cirurBem+cirurMal));  
            }else{
                System.out.println("CRM INVÁLIDO!");
            }
    }
    public void horaDisponivel(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe CRM do(a) médico(a) que deseja ver o horário de trabalho:");
        crmMedico = ler.nextInt();
   
            if ( crmMedico == crm){
                System.out.println("=================HORÁRIO================");
                System.out.println("CRM........................."+crm);
                System.out.println("AREA DE ATUACAO............."+areaAtuacao);
                System.out.println("ESPECIALIDADE..............."+especializacao);
                System.out.println("HORARIO DE ENTRADA.........."+horaEntrada);
                System.out.println("HORARIO DE SAIDA............"+horaSaida);
            }else{
                System.out.println("CRM INVÁLIDO!");
            }
    }
}