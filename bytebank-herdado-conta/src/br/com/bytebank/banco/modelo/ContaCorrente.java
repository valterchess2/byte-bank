package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(int numero, Cliente titular) {
        super(numero, titular);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException{
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
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
