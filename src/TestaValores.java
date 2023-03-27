public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1899,54588558);
        // Vendo total de contas atraves Da classe conta e do método static total
        System.out.println(Conta.getTotal());
    }
}
