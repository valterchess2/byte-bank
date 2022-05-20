public class CriaConta {
    public static void main(String[] args) {
        Conta conta = new Conta("Valter Silva");
        Conta conta2 = new Conta("João Aleatório");

        System.out.println(conta.getNumero());
        System.out.println(conta2.getNumero());
    }
}
