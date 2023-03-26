public class TesteSacaNegativo {
    public static void main(String[] args) {
        // Instanciado classe
        Conta conta = new Conta();
        // Atribuindo valor para método deposita
        conta.deposita(100);
        // Sacando valor por metodo saca
        System.out.println(conta.saca(200));
        System.out.println(conta.getSaldo());

        // proibido isso acontecer por mudamos os atributos de public para privado
        // conta.saldo = conta.saldo - 101;

        System.out.println(conta.getSaldo());
    }
}
