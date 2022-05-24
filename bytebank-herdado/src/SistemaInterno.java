public class SistemaInterno {
    private int senha = 2222;
    public void autentica(FuncionarioAutenticavel funcionario){
        boolean autenticou = funcionario.autentica(this.senha);
        System.out.println((autenticou) ? "Pode entrar no Sistema" : "Não autorizado!");
    }
}
