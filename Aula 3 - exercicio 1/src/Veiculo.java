class Veiculo {
    // Atributos protegidos
    protected String modelo;
    protected int ano;

    // Construtor
    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Metodo ligar
    public void ligar() {
        System.out.println("O veículo " + modelo + " está ligado.");
    }
}