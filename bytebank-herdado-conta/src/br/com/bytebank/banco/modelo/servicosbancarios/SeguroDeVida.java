package br.com.bytebank.banco.modelo.servicosbancarios;

import br.com.bytebank.banco.contratos.Tributavel;

public class SeguroDeVida implements Tributavel {
    private double valorSeguro;
    @Override
    public double getValorImposto() {
        this.valorSeguro = 1000.0;
       return 42;
    }
    public double getValorSeguro() {
        return valorSeguro;
    }
}
