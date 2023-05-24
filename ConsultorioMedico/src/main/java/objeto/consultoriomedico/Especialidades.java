package objeto.consultoriomedico;

import java.util.Date;

import java.util.Scanner;

/**
 *
 * @author Maria
 */
public class Especialidades {

    public String nome;
    private String crm;
    public String dataNascimento;
    public String telefone;
    public String formacao;
    public String areaAtuacao;

    public Especialidades(String nome, String crm, String dataNascimento, String telefone, String formacao, String areaAtuacao) {
        this.nome = nome;
        this.crm = crm;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.formacao = formacao;
        this.areaAtuacao = areaAtuacao;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void mostrarFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("CRM: " + crm);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Telefone: " + telefone);
        System.out.println("Formação: " + formacao);
        System.out.println("Área de Atuação: " + areaAtuacao);
    }
}
