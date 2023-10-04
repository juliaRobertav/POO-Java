public class MainConta {
    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.deposito(100);
        conta.deposito(100, "Fiz o depósito");

        System.out.println(conta.saldo);

        ContaCorrente corrente = new ContaCorrente();
        corrente.deposito(100);
        System.out.println(corrente.saldo);

    }
}
