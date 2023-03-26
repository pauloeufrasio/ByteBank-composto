public class TestaSemCliente {
    public static void main(String[] args) {
        // Instanciando classes .
        Conta marcela = new Conta();
        Cliente clienteMarcela = new Cliente();
        // Criando referencia titular atraves da classe Cliente
        clienteMarcela.titular = new Cliente();
        // Atribuindo informações pra clienteMarcela
        clienteMarcela.titular.nome =" Marcela ";
        clienteMarcela.titular.cpf =" 123.456.789-10 ";
        clienteMarcela.titular.profissão =" Marcela ";
        // Printando o valor na tela
        System.out.println(clienteMarcela.titular.nome);
        System.out.println(clienteMarcela.titular.cpf);
        System.out.println(clienteMarcela.titular.profissão);
    }
}
