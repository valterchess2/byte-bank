public class Administrador extends Funcionario implements Autenticavel{
    private int senha;
    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        {
            if (this.senha == senha) {
                return true;
            }
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        return 0;
    }
}
