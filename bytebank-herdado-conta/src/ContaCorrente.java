public class ContaCorrente extends Conta implements Tributavel{
    public ContaCorrente(int numero, Cliente titular) {
        super(numero, titular);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }
}
