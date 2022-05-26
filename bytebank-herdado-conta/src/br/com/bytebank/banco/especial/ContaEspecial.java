package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

    public ContaEspecial(int numero, Cliente titular) {
        super(numero, titular);
    }

    @Override
    public void deposita(double valor) {
        System.out.println("Daime");
    }
}
