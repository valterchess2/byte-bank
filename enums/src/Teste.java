public class Teste {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> System.out.println("rodando..."));
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
    }
}
