/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.consultoriomedico;
import java.util.Scanner; 

/**
 *
 * @author lucas
 */
public class Medico extends Pessoa {
    Agendamento agendamento = new Agendamento();
    Scanner ler = new Scanner(System.in);
    
    
    private int crm; 
    public String especialidade;
    public String prescricao;
    
    public Medico(){}
  
    public Medico(int crm, String especialidade, int idPessoa, String nome, String sobrenome, int idade, char sexo, String cpf, String telefone, String email, String cep, String endereco) {
        super(idPessoa, nome, sobrenome, idade, sexo, cpf, telefone, email, cep, endereco);
        this.crm = crm;
        this.especialidade = especialidade;
    }
    
    public void realizarConsulta(){
    System.out.println("O médico está realizando uma consulta no momento!");
    
    }
    
    public void prescreverReceita(){
        System.out.println("        MEDIC SOFTWARES        ");
        System.out.println("RECEITA NÚMERO: "+agendamento.getIdAgendamento());
        System.out.println("PACIENTE: "+agendamento.nomeCompleto);
        System.out.println("TELEFONE: "+agendamento.getTelefone());
        System.out.println("\n\nPRESCRIÇÃO: ");
        prescricao = ler.nextLine();
                
    
    }
    
    
}
