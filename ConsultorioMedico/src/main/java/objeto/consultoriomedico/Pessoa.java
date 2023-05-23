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
public class Pessoa {
    
    public int idPessoa; 
    public String nome;
    public String sobrenome; 
    private int idade; 
    private char sexo; 
    private String cpf; 
    private String telefone; 
    private String email; 
    private String cep; 
    private String endereco; 
    
    public Pessoa(){}

    public Pessoa(int idPessoa, String nome, String sobrenome, int idade, char sexo, String cpf, String telefone, String email, String cep, String endereco) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.cep = cep;
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void cadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("QUEM VOCÊ DESEJA CADASTRAR? ");
        System.out.println("[1] Paciente   [2] Medico");
        
        int cadastro= sc.nextInt(); 
        switch (cadastro) {
            
            case 1:
                System.out.println("");
        
        
        }
    
    }
    
    
}
