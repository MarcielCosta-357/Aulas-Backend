class Carro {
    // Atributos privados
    private String modelo;
    private Motor motor; // Atributo representando a composição

    // Construtor
    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    // Metodo ligarCarro
    public void ligarCarro() {
        System.out.println("Iniciando a partida do carro: " + modelo + "...");
        motor.ligar(); // Aciona o método do motor correspondente
        System.out.println("O carro " + modelo + " está pronto para rodar.\n");
    }

    // Metodo desligarCarro
    public void desligarCarro() {
        System.out.println("Desligando o carro: " + modelo + "...");
        motor.desligar(); // Aciona o método do motor correspondente
        System.out.println("O carro " + modelo + " foi desligado com segurança.\n");
    }
}