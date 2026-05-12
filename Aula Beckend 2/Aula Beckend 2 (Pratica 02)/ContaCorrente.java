public class ContaCorrente {

    // Atributos privados
    private String titular;
    private int numeroConta;
    private double saldo;
    private double limite;

    // Construtor: inicializa com titular e número da conta
    public ContaCorrente(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;    // Valor padrão inicial
        this.limite = 500.0; // Valor padrão inicial do limite
    }

    // Métodos Get e Set para todos os atributos
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Outros métodos: depositar, sacar e emitir saldo
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depósito de R$ %.2f efetuado com sucesso.\n", valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= (this.saldo + this.limite)) {
            this.saldo -= valor;
            System.out.printf("Saque de R$ %.2f efetuado com sucesso.\n", valor);
        } else {
            System.out.println("Saque recusado: saldo e limite insuficientes ou valor inválido.");
        }
    }

    public void emitirSaldo() {
        System.out.printf("Saldo atual: R$ %.2f\n", getSaldo());
    }

    // Método modificado para apresentar todas as informações da conta
    public void mostrarInfo() {
        System.out.println("--- Informações da Conta ---");
        System.out.printf("Nome do titular: %s\n", getTitular());
        System.out.printf("Número da conta: %d\n", getNumeroConta());
        System.out.printf("Saldo: R$ %.2f\n", getSaldo());
        System.out.printf("Limite: R$ %.2f\n", getLimite());
        System.out.println("----------------------------");
    }
}