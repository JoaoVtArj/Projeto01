package ATM;

public class atm24 {
    private int numconta;
    private String nome;
    private double saldo;

    public atm24(int nunconta, String nome) {
        this.numconta = numconta;
        this.nome = nome;
    }

    public atm24(int numconta, String nome, double saldoInicial) {
        this.numconta = numconta;
        this.nome = nome;
        deposito(saldoInicial);
    }


    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void deposito(double valorDeposito) {
        saldo += valorDeposito;
    }

    public void saque(double valorSaque) {
        saldo -= valorSaque + 5.0;
    }

    @Override
    public String toString() {
        return "conta "
                + numconta
                + ", nome: "
                + nome
                +", Valor: R$ "
                + String.format("%.2f", saldo);
    }
}