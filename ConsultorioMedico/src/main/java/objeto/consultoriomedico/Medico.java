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
public class Medico extends Funcionario {

    Receita receita = new Receita();
    Scanner ler = new Scanner(System.in);

    public Medico(String nome, int idade, String cpf, String telefone, String email, String cep, String endereco, String cargo) {
        super(nome, idade, cpf, telefone, email, cep, endereco, cargo);

    }

    private int crm;
    public String especialidade;

    public void realizarConsulta() {
        System.out.println("O médico está realizando uma consulta no momento!");

        receita.cadastrarReceita();
        receita.emitirReceita();

    }
        
}
