package br.com.bytebank.banco.modelo.Conta;

import br.com.bytebank.banco.modelo.Cliente.Cliente;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, Cliente titular) {
        super(numero, titular);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
    @Override
    public String toString() {
        return "Conta Poupanca, " + super.toString();
    }
}
