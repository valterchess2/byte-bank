package br.com.bytebank.banco.modelo;

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
