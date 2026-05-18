class Moto extends Veiculo {
    private boolean temBagageiro;

    // Construtor da Moto
    public Moto(String modelo, int ano, boolean temBagageiro) {
        super(modelo, ano); // Chama o construtor da superclasse
        this.temBagageiro = temBagageiro;
    }

    // Metodo empinar
    public void empinar() {
        System.out.println("A moto " + modelo + " está empinando!");
    }
}