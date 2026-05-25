public class AppFinanceiro {
    public static void main(String[] args) {
        // Criando variáveis do tipo Pagamento
        Pagamento pgtoCartao = new CartaoCredito();
        Pagamento pgtoBoleto = new Boleto();
        Pagamento pgtoPix = new Pix();

        // Processando Cartão de Crédito
        System.out.println("=== Operação 1: " + pgtoCartao.getDescricao() + " ===");
        pgtoCartao.pagar(1500.50);

        // Processando Boleto
        System.out.println("\n=== Operação 2: " + pgtoBoleto.getDescricao() + " ===");
        pgtoBoleto.pagar(350.00);

        // Processando Pix
        System.out.println("\n=== Operação 3: " + pgtoPix.getDescricao() + " ===");
        pgtoPix.pagar(85.90);
    }
}