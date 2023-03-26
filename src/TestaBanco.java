public class TestaBanco {
    public static void main(String[] args) {
        // Instanciando e criando Cliente paulo da Classe Cliente.
        Cliente paulo = new Cliente();
        // Atribuindo informações para pro Cliente paulo e testando  a variavel (titular) do tipo Classe.
        paulo.titular.nome = " Paulo henrique ";
        paulo.titular.cpf = " 459.638.908-02 ";
        paulo.titular.profissão = "Auxiliar Administrativo";
        // Criando conta do paulo.
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(200);
        // Printando na tela.
        System.out.println(paulo.titular.nome);
        System.out.println(paulo.titular.cpf);
        System.out.println(paulo.titular.profissão);
    }
}
