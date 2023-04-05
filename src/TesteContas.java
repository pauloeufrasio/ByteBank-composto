public class TesteContas {
    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Hnerique");
        paulo.setCpf("123.456.789-10");
        paulo.setProfissão("Programador senior");

        ContaCorrente contaDoPaulo = new ContaCorrente(128,2458);
        contaDoPaulo.setSaldo(2000);
        contaDoPaulo.deposita(100);

        ContaPoupanca contaMarcela = new ContaPoupanca(455,2547);
        contaMarcela.setSaldo(1500);
        contaMarcela.deposita(200);


        System.out.println("Conta Do Paulo " + contaDoPaulo.getSaldo());
        System.out.println("Conta Da Marcela " +contaMarcela.getSaldo());
    }
}
