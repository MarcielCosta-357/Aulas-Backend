class Carro extends Veiculo {
    private int portas;

    // Construtor do Carro
    public Carro(String modelo, int ano, int portas) {
        super(modelo, ano); // Chama o construtor da superclasse
        this.portas = portas;
    }

    // Metodo abrirPortas
    public void abrirPortas() {
        System.out.println("Abrindo " + portas + " portas do carro " + modelo + ".");
    }
}