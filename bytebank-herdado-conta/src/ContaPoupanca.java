public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, Cliente titular) {
        super(numero, titular);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
