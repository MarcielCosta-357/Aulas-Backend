public class Pix implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Iniciando transferência instantânea de R$ " + valor + "...");
        System.out.println("Pagamento via Pix confirmado pelo Banco Central!");
    }

    @Override
    public String getDescricao() {
        return "Pix - Transferência imediata 24 horas por dia.";
    }
}