public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    // Construtor
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Metodo concreto
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$ " + salarioBase);
    }

    // Metodo abstrato
    public abstract double calcularSalarioFinal();
}