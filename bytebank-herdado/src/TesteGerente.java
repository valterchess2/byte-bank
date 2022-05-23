public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();

        g1.setNome("Valter");
        g1.setCpf("2341098124");
        g1.setSalario(2500);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());


        g1.setSenha(20022);

        boolean autenticado = g1.autentica(20022);
        System.out.println(autenticado);
    }
}
