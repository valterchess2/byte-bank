package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente.Cliente;
import br.com.bytebank.banco.modelo.Conta.Conta;
import br.com.bytebank.banco.modelo.Conta.ContaCorrente;
import br.com.bytebank.banco.exceptions.SaldoInsuficienteException;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, new Cliente());
        conta.deposita(200);
        try {
            conta.saca(210);
        } catch (SaldoInsuficienteException ex){
            System.out.println("Ex: "+ex.getMessage());
        }
        System.out.println(conta.getSaldo());
    }
}
