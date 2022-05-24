public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, new Cliente());
        cc.deposita(100);
        SeguroDeVida seguro = new SeguroDeVida();

        CalculaImposto calculador = new CalculaImposto();

        calculador.registra(cc);
        calculador.registra(seguro);

        System.out.println(calculador.getImpostoTotal());

    }
}
