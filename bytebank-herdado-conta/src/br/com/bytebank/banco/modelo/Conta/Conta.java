package br.com.bytebank.banco.modelo.Conta;

import br.com.bytebank.banco.modelo.Cliente.Cliente;
import br.com.bytebank.banco.contratos.DoublePositivo;
import br.com.bytebank.banco.exceptions.SaldoInsuficienteException;

/**
 * <h2>Classe que representa o modelo de uma conta</h2>
 *
 * @author Valter
 * @version 0.1
 */
public abstract class Conta {


    @DoublePositivo
    protected double saldo;
    private static final String AGENCIA = "0001";
    private static int numeroConta = 0;
    private final int numero;
    private Cliente titular;


    /**
     * Construtor para inicializar o objeto Conta a partir do número e Titular
     *
     * @param numero
     * @param titular
     */
    protected Conta(int numero, Cliente titular) {
        this.titular = titular;
        this.numero = numero;
        Conta.numeroConta++;
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

    /**
     * Valor precisa ser maior do que o saldo.
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */
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

    @Override
    public String toString() {
        return "Número: " + this.getNumero()
                + ", Agencia: " + Conta.AGENCIA;
    }
}
