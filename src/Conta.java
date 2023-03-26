public class Conta {
    // Declarando os atributos da classe conta
    public double saldo;
    public int agencia;
    public int numero;
    String titular;
    // Criando o metodo deposita que recebe (valor) como parametro e retorna saldo o que ta nele mesmo mais o (valor)
    public void deposita(double valor){
        this.saldo += valor;
    }
    // Criando o metodo saca que tambem recebe valor como parametro obs: A variavel (valor) é diferente da variavel do metodo deposita.
    public boolean saca(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println(" Voce retirou $" + valor + " e o valor atual é $" +this.saldo);
            return true;
        }
        else {
            System.out.println("Voce nao tem saldo suficiente pra completar essa transação seu saldo é "+ this.saldo);
            return false;
        }
    }
    // Criando metodo transfere recebendo valor como parametro e conta destino
    public boolean transfere (double valor, Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            // inserindo variavel (valor) dentro da conta destino
            destino.deposita(valor);
            System.out.println("Transferencia realizada com sucesso seu saldo é $" +this.saldo+ " e o valor transferido foi de $" +valor);
            return true;
        }
        System.out.println("Voce nao tem saldo suficiente pra completar essa transação seu saldo é de " +this.saldo);
        return false;
    }

}
