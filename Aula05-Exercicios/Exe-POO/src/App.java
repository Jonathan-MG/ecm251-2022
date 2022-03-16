public class App {
    public static void main(String[] args) throws Exception {

        // Declara um objeto do tipo Conta
        Conta minhaConta;
        // Instanciar um objeto do tipo Conta
        minhaConta = new Conta();
        // Declarou e Instanciou um objeto do tipo Conta
        Conta outraConta = new Conta();

        minhaConta.saldo = 200.0;
        minhaConta.numero = 231;
        outraConta.saldo = 150.0;
        outraConta.numero = 728;

        System.out.println();

        System.out.println("Saldo da minhaConta:");
        minhaConta.visualizarSaldo();

        System.out.println("Saldo da outraConta:");
        outraConta.visualizarSaldo();

        if (!minhaConta.depositar(500.0)) {
            System.out.println("Operacao falhou!");
            System.out.println();
        }
        if (!minhaConta.sacar(2100.0)) {
            System.out.println("Operacao falhou!");
            System.out.println();
        }
        minhaConta.visualizarSaldo();

        minhaConta.transferirDinheiro(-5000, outraConta);

        System.out.println("Saldo da minhaConta:");
        minhaConta.visualizarSaldo();

        System.out.println("Saldo da outraConta:");
        outraConta.visualizarSaldo();
    }
}
