public class TestaBanco {
    public static void main(String[] args) {
        Cliente valter = new Cliente();
        Conta contaDoValter = new Conta();
        contaDoValter.deposita(100);
        valter.setNome("Valter Silva");
        valter.setCpf("22.222.222-33");
        contaDoValter.setTitular(valter);
        System.out.println(contaDoValter.getTitular().getNome());
    }
}
