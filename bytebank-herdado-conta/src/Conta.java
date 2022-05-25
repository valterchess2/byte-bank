public abstract class Conta {
    @DoublePositivo
    protected double saldo;
    private static final String AGENCIA = "0001";
    private static int numeroConta = 0;
    private final int numero;
    private Cliente titular;

    {
        Conta.numeroConta++;
    }

    public Conta(int numero, Cliente titular) {
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

    public void saca(double valor)  throws SaldoInsuficienteException{
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + " Valor: " + valor);
        }
        saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }
}
