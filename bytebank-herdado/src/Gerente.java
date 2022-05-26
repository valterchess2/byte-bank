// gerente é um funcionário
public class Gerente extends Funcionario implements Autenticavel {
    private final Autenticador autenticador;

    public Gerente() {
        this.autenticador = new Autenticador();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public double getBonificacao() {
        System.out.println("chamando o método de bonificação de GERENTE");
        return super.getSalario();
    }

}
