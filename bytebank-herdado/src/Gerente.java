// gerente é um funcionário
public class Gerente extends Funcionario implements Autenticavel{
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
    public double getBonificacao(){
        return this.getSalario();
    }

    }
