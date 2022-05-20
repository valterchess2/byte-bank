public class Conta {
    private double saldo;
    private static final String AGENCIA = "0001";
    private static int numeroConta = 0;
    private final int numero;
    private final String titular;

    public Conta(String titular){
        numeroConta++;
        numero = numeroConta;
        this.titular = titular;
    }
    // para aplicar o conceito de imutabilidade
 private Conta(Conta conta, double saldo){
        this.titular = conta.getTitular();
        this.numero = conta.getNumero();
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getAgencia() {
        return AGENCIA;
    }

    public int getNumero() {
        return numero;
    }

    public Conta deposita(double valor){
        Conta contaNovoSaldo = new Conta(this, valor);
        return contaNovoSaldo;
    }

    public String getTitular() {
        return titular;
    }
}
