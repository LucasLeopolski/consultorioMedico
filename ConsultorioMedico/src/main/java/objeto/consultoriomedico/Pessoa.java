
package objeto.consultoriomedico;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author lucas
 */
public class Pessoa {
    paciente novoPaciente = new paciente(); 
    Random random = new Random();

    public int idPessoa;
    public String nome;
    public String sobrenome;
    public int idade;
    public char sexo;
    public String cpf;
    public String telefone;
    public String email;
    public String cep;
    public String endereco;

    public Pessoa() {
    }

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

    public void cadastrarFuncionario() {
        
        System.out.println("Nome: "+this.nome);
        System.out.println("Sobrenome: "+this.sobrenome);
        System.out.println("Telefone: "+this.telefone);
        System.out.println("Cpf: "+this.cpf);
        System.out.println("Endereço: "+this.endereco);
        
        

    }
    
    public void cadastrarPaciente() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nome = ler.nextLine();
        System.out.println("Informe seu sobrenome: ");
        sobrenome = ler.nextLine();
        System.out.println("Informe seu telefone: ");
        telefone = ler.nextLine();
        System.out.println("Informe seu cpf:  ");
        cpf = ler.nextLine();
        System.out.println("Informe seu endereco:  ");
        endereco = ler.nextLine();
        System.out.printf("Id Paciente: ");
        novoPaciente.idPaciente = random.nextInt(1000);
        System.out.println(novoPaciente.idPaciente);

    }

}
