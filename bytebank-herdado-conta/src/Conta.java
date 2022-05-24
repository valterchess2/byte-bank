public abstract class  Conta {
    protected double saldo;
    private static final String AGENCIA = "0001";
    private static int numeroConta = 0;
    private final int numero;
    private Cliente titular;

    {
        Conta.numeroConta++;
    }

    public Conta(int numero, Cliente titular){
        this.titular = titular;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static String getAgencia() {
        return AGENCIA;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if (this.saldo >= valor && valor > 0) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta contaDestino) {
        if (valor > 0 && this.saldo >= valor && contaDestino != null) {
            this.saca(valor);
            contaDestino.deposita(valor);
            return true;
        }
        return false;
    }
}