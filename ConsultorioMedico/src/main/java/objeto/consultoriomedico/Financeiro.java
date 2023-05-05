import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Financeiro {
    
    public String nomeTitular;
    public double valorMinimo;

    private double saldo;
    private double taxaJuro;
    private int numConta;
    private String tipoConta;
    private Date dtAbertura;
    private Date dtFechamento;
    private List<String> historicoTransacao;
    private double limiteCredito;

    public Financeiro(String nomeTitular, double valorMinimo, double taxaJuro, int numConta, String tipoConta, Date dtAbertura, double limiteCredito) {
        this.nomeTitular = nomeTitular;
        this.valorMinimo = valorMinimo;
        this.saldo = valorMinimo;
        this.taxaJuro = taxaJuro;
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.dtAbertura = dtAbertura;
        this.dtFechamento = null;
        this.historicoTransacao = new ArrayList<>();
        this.limiteCredito = limiteCredito;
    }

    public void depositarDinheiro(double valor) {
        this.saldo += valor;
        this.historicoTransacao.add("Depósito de R$" + valor);
    }

    public void sacarDinheiro(double valor) {
        if (valor <= (this.saldo + this.limiteCredito)) {
            this.saldo -= valor;
            this.historicoTransacao.add("Saque de R$" + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double calcularJuros() {
        Date hoje = new Date();
        long diferenca = hoje.getTime() - this.dtAbertura.getTime();
        int dias = (int) (diferenca / (24 * 60 * 60 * 1000));
        double juros = this.saldo * this.taxaJuro * dias / 365;
        return juros;
    }
}

