public class TestaBanco {
    public static void main(String[] args) {
        // Instanciando e criando Cliente paulo da Classe Cliente.
        Cliente paulo = new Cliente();
        // Atribuindo informações para pro Cliente paulo e testando  a variavel (titular) do tipo Classe.
        paulo.titular = new Cliente();
        paulo.titular.setNome(" Paulo henrique ");
        paulo.titular.setCpf(" 459.638.908-02 ");
        paulo.titular.setProfissão("Auxiliar Administrativo");
        // Criando conta do paulo.
        Conta contaDoPaulo = new Conta(5445,02350);
        contaDoPaulo.deposita(200);
        // Printando na tela.
        System.out.println(paulo.titular.getNome());
        System.out.println(paulo.titular.getCpf());
        System.out.println(paulo.titular.getProfissão());
    }
}
