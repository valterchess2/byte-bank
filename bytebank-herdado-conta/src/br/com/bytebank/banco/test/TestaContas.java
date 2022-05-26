package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;


public class TestaContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente contaCorrente = new ContaCorrente(1111, new Cliente());
        contaCorrente.deposita(100);

        ContaPoupanca contaPoupanca = new ContaPoupanca(121212, contaCorrente.getTitular());
        contaPoupanca.deposita(200);

        contaCorrente.transfere(10, contaPoupanca);

        System.out.println("CC: " + contaCorrente.getSaldo());
        System.out.println("CP: " + contaPoupanca.getSaldo());
    }
}
