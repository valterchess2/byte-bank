package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente.Cliente;
import br.com.bytebank.banco.modelo.Conta.ContaCorrente;
import br.com.bytebank.banco.modelo.Conta.ContaPoupanca;

public class TesteObject {
    public static void main(String[] args) {
//        System.out.println("Xis");
//        System.out.println(3);
//        System.out.println(false);

        Cliente cliente = new Cliente();
        ContaCorrente cc = new ContaCorrente(123, cliente);
        ContaPoupanca cp = new ContaPoupanca(321, cliente);

        System.out.println(cp);
        System.out.println(cc);
    }

    static void println() {}
    static void println(int num) {}
    static void println(boolean valor) {}
    static void println(Object valor) {}
}
