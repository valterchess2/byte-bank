package br.com.bytebank.banco.modelo.servicos;

import br.com.bytebank.banco.modelo.Conta.Conta;

public class GuardadorDeContas {
    private Object[] referencias;
    private int posicaoLivre;
    public GuardadorDeContas(){
        this.referencias = new Object[10];
        posicaoLivre = 0;
    }

    public void adiciona(Object ref){
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferencia(int pos) {
        return this.referencias[pos];
    }
}
