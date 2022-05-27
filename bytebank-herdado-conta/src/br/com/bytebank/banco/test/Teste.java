package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente.Cliente;
import br.com.bytebank.banco.modelo.Conta.Conta;
import br.com.bytebank.banco.modelo.Conta.ContaCorrente;
import br.com.bytebank.banco.modelo.servicos.GuardadorDeContas;

public class Teste {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();
        Conta cc = new ContaCorrente(432, new Cliente());
        Conta cc2 = new ContaCorrente(433, new Cliente());

        guardador.adiciona(cc);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReferencia(0);
        System.out.println(ref.toString());
    }
}
