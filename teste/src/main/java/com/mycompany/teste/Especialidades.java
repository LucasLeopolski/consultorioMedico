package com.mycompany.teste;

import java.util.Date;

public class Especialidades {
       
    public String especializacao;
    public boolean cirurBem;
    public boolean cirurMal;
    public String formacao;
    public String areaAtuacao;
    private int crm;
    private int telefone;
    private Date dataNascimento;
    private int horaEntrada;
    private int horaSaida; 

    public Especialidades(String especializacao, boolean cirurBem, boolean cirurMal, String formacao, String areaAtuacao, int crm, int telefone, Date dataNascimento, int horaEntrada, int horaSaida) {
        this.especializacao = especializacao;
        this.cirurBem = cirurBem;
        this.cirurMal = cirurMal;
        this.formacao = formacao;
        this.areaAtuacao = areaAtuacao;
        this.crm = crm;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

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
        
    }
    public void acessarRelatorio(){
        
    }
    public void horaDisponivel(){
        
    }
}
