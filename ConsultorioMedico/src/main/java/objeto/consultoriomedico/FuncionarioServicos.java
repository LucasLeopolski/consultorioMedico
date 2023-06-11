package objeto.consultoriomedico;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioServicos {
    private List<Funcionario> funcionarios;

    public FuncionarioServicos() {
        funcionarios = new ArrayList<>();
    }

    public void cadastrarFuncionario(String nome, int idade, String cpf, String telefone, String email, String cep, String endereco, String cargo) {
        int idFuncionario = gerarNovoId();
        Funcionario funcionario = new Funcionario(nome, idade, cpf, telefone, email, cep, endereco, cargo);
        funcionario.setIdFuncionario(idFuncionario);
        funcionarios.add(funcionario);
    }

    public void atualizarFuncionario(Funcionario funcionarioAtualizado) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getIdFuncionario() == funcionarioAtualizado.getIdFuncionario()) {
                funcionarios.set(i, funcionarioAtualizado);
                break;
            }
        }
    }

    public Funcionario buscarFuncionario(int idFuncionario) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getIdFuncionario() == idFuncionario) {
                return funcionario;
            }
        }
        return null;
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    private int gerarNovoId() {
        int maxId = 0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getIdFuncionario() > maxId) {
                maxId = funcionario.getIdFuncionario();
            }
        }
        return maxId + 1;
    }    
}
