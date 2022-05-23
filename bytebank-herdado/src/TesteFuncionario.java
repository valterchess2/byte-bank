public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario valter = new Funcionario();


        valter.setNome("Valter Silva");
        valter.setCpf("440.442.040-20");
        valter.setSalario(2200);

        System.out.println(valter.getNome());
        System.out.println(valter.getBonificacao());
    }
}
