public class TestaSemCliente {
    public static void main(String[] args) {
        // Instanciando classes .
        Conta marcela = new Conta(2115,024);
        Cliente clienteMarcela = new Cliente();
        // Criando referencia titular atraves da classe Cliente
        clienteMarcela.titular = new Cliente();
        // Atribuindo informações pra clienteMarcela
        clienteMarcela.titular.setNome(" Marcela ");
        clienteMarcela.titular.setCpf(" 123.456.789-10 ");
        clienteMarcela.titular.setProfissão(" Marcela ");
        // Printando o valor na tela
        System.out.println(clienteMarcela.titular.getNome());
        System.out.println(clienteMarcela.titular.getCpf());
        System.out.println(clienteMarcela.titular.getProfissão());
        Conta conta2 = new Conta(1445,5454);
    }
}
