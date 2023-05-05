public class Funcionario {
    public String nome;
    public String telefone;
    public String dtNasc;
    public String cargo;
    public String supervisor;
    public String dataIngresso;
    public String hrEntrada;
    public String hrSaida;
    private int id;
    private int codPonto;
    private double salario;
    
    public Funcionario(String nome, String telefone, String dtNasc, String cargo, String supervisor, 
                       String dataIngresso, String hrEntrada, String hrSaida, int id, int codPonto, double salario) {
        this.nome = nome;
        this.telefone = telefone;
        this.dtNasc = dtNasc;
        this.cargo = cargo;
        this.supervisor = supervisor;
        this.dataIngresso = dataIngresso;
        this.hrEntrada = hrEntrada;
        this.hrSaida = hrSaida;
        this.id = id;
        this.codPonto = codPonto;
        this.salario = salario;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getCodPonto() {
        return codPonto;
    }
    
    public void setCodPonto(int codPonto) {
        this.codPonto = codPonto;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void atualizarFuncionario(String nome, String telefone, String dtNasc, String cargo, String supervisor, 
                                      String dataIngresso, String hrEntrada, String hrSaida, int id, int codPonto, double salario) {
        this.nome = nome;
        this.telefone = telefone;
        this.dtNasc = dtNasc;
        this.cargo = cargo;
        this.supervisor = supervisor;
        this.dataIngresso = dataIngresso;
        this.hrEntrada = hrEntrada;
        this.hrSaida = hrSaida;
        this.id = id;
        this.codPonto = codPonto;
        this.salario = salario;
        System.out.println("Funcionário atualizado com sucesso!");
    }
    
    public double calcularSalario() {
        return salario;
    }
    
    public void cadastrarFuncionario(String nome, String telefone, String dtNasc, String cargo, String supervisor, 
                                      String dataIngresso, String hrEntrada, String hrSaida, int id, int codPonto, double salario) {
        Funcionario novoFuncionario = new Funcionario(nome, telefone, dtNasc, cargo, supervisor, 
                                                       dataIngresso, hrEntrada, hrSaida, id, codPonto, salario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }
}
