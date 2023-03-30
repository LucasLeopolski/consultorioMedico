package com.mycompany.teste;

/**
 *
 * @author aluno
 */
public class Paciente {
    
    public String  nome;
    public int idade;
    public char sexo;
    private int id;
    private int cpf;
    private int rg;
    private int telFixo;
    private int telMovel;
    private String email;
    private int cep;
    private String endereco;

    public Paciente(String nome, int idade, char sexo, int id, int cpf, int rg, int telFixo, int telMovel, String email, int cep, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.id = id;
        this.cpf = cpf;
        this.rg = rg;
        this.telFixo = telFixo;
        this.telMovel = telMovel;
        this.email = email;
        this.cep = cep;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(int telFixo) {
        this.telFixo = telFixo;
    }

    public int getTelMovel() {
        return telMovel;
    }

    public void setTelMovel(int telMovel) {
        this.telMovel = telMovel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void atualizarPaciente(){
        
    }
    public void pesquisarPaciente(){
        
    }
    public void cadastrarPaciente(){
        
    }
}
