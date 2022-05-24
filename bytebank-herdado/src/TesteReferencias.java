public class TesteReferencias {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Valter");
        gerente.setSalario(5000);

        EditorDeVideo editor = new EditorDeVideo();
        editor.setSalario(2500);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gerente);
        controle.registra(editor);

        System.out.println(controle.getSoma());
    }
}
