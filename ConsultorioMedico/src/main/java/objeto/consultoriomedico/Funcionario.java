package objeto.consultoriomedico;

public class Funcionario extends Pessoa {
    private String cargo;
    private int idFuncionario;

    public Funcionario(String nome, int idade, String cpf, String telefone, String email, String cep, String endereco, String cargo) {
         super(' ', nome, "", idade, ' ', cpf, telefone, email, cep, endereco);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void cadastrarFuncionario() {
        super.cadastrarFuncionario(); 
    }
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
}
