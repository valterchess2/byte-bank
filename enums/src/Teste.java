import enums.Prioridade;

public class Teste {
    public static void main(String[] args) {
       Prioridade pmin = Prioridade.MIN;
       Prioridade pmax = Prioridade.MAX;

        System.out.println(pmin.name());
        System.out.println(pmax.name());

        System.out.println(pmin.ordinal());
        System.out.println(pmax.ordinal());

        System.out.println(pmin.getValor());
        System.out.println(pmax.getValor());
    }
}
