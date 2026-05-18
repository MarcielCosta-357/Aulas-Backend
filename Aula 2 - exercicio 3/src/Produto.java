public class Produto {

    // Atributos da classe
    private String nome;
    private double preco;
    private int quantidade;

    // 1. Construtor sem parâmetros
    public Produto() {
        this.nome = "Sem nome";
        this.preco = 0.0;
        this.quantidade = 0;
    }

    // 2. Construtor com nome e preço (quantidade é zero por padrão)
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    // 3. Construtor com todos os parâmetros (nome, preço e quantidade)
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método para imprimir os dados do produto
    public void exibirInfo() {
        System.out.printf("Produto: %s\n", this.nome);
        System.out.printf("Preço: R$ %.2f\n", this.preco);
        System.out.printf("Quantidade: %d\n", this.quantidade);
        System.out.println("-----------------------------");
    }
}