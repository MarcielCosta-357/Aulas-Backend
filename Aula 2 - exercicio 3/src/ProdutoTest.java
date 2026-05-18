public class ProdutoTest {

    public static void main(String[] args) {

        // Objeto 1: Utiliza o construtor sem parâmetros
        System.out.println("--- Teste do Construtor 1 ---");
        Produto produto1 = new Produto();
        produto1.exibirInfo();

        // Objeto 2: Utiliza o construtor com 2 parâmetros (nome e preço)
        System.out.println("--- Teste do Construtor 2 ---");
        Produto produto2 = new Produto("Teclado Mecânico", 350.00);
        produto2.exibirInfo();

        // Objeto 3: Utiliza o construtor com 3 parâmetros (nome, preço e quantidade)
        System.out.println("--- Teste do Construtor 3 ---");
        Produto produto3 = new Produto("Monitor 24 polegadas", 1200.50, 15);
        produto3.exibirInfo();
    }
}