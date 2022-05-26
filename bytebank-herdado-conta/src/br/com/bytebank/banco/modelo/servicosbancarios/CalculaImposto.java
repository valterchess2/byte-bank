package br.com.bytebank.banco.modelo.servicosbancarios;

import br.com.bytebank.banco.contratos.Tributavel;

public class CalculaImposto {
    private double impostoTotal;

    public void registra(Tributavel tributavel){
        double valor = tributavel.getValorImposto();
        this.impostoTotal += valor;
    }

    public double getImpostoTotal() {
        return impostoTotal;
    }
}
