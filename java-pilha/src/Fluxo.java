public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaException exception) {
            String message = exception.getMessage();
            System.out.println("Exception - " + message);
            exception.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
            throw  new MinhaException("Deu Erro");
//        System.out.println("Fim do metodo2");
    }
}