public class Boleto implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Gerando código de barras para o valor de R$ " + valor + "...");
        System.out.println("Aguardando o pagamento do Boleto Bancário.");
    }

    @Override
    public String getDescricao() {
        return "Boleto Bancário - Compensação em até 3 dias úteis.";
    }
}