class Motor {
    // Atributos privados
    private int potencia;
    private String tipo;

    // Construtor
    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    // Metodo para ligar o motor
    public void ligar() {
        System.out.println("Motor (" + tipo + " - " + potencia + " CV) acionado e em funcionamento.");
    }

    // Metodo para desligar o motor
    public void desligar() {
        System.out.println("Motor (" + tipo + " - " + potencia + " CV) desativado.");
    }
}