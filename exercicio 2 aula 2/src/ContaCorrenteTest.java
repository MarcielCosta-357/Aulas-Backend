public class ContaCorrenteTest {

    public static void main(String[] args) {
        // Inicialização do objeto com o novo construtor (titular e número da conta)
        ContaCorrente minhaConta = new ContaCorrente("Marciel Costa da Rosa", 12345);

        // Apresentar as informações iniciais da conta
        minhaConta.mostrarInfo();

        // Realizar algumas operações de depósito e saque
        System.out.println("\n--- Movimentos ---");
        minhaConta.depositar(1000.0);
        minhaConta.emitirSaldo();

        minhaConta.sacar(250.0);
        minhaConta.emitirSaldo();

        // Tentar um saque que utilize o limite
        minhaConta.sacar(1000.0); // O saldo é 750, mas com o limite de 500, a operação é permitida

        // Alterar o limite através do metodo set
        minhaConta.setLimite(1000.0);

        // Mostrar as informações finais para confirmar o estado do objeto
        System.out.println();
        minhaConta.mostrarInfo();
    }
}