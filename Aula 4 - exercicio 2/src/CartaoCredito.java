public class CartaoCredito implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Aprovando transação de R$ " + valor + " no limite do Cartão de Crédito...");
        System.out.println("Pagamento via Cartão de Crédito realizado com sucesso!");
    }

    @Override
    public String getDescricao() {
        return "Cartão de Crédito - Crédito à vista ou parcelado.";
    }
}