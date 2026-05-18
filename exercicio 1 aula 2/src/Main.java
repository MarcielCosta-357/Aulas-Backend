// 1. Classe Veículo
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

// 2. Subclasse Carro
class Carro extends Veiculo {
    private int portas;

    // Construtor do Carro
    public Carro(String modelo, int ano, int portas) {
        super(modelo, ano); // Chama o construtor da superclasse
        this.portas = portas;
    }

    // Método abrirPortas
    public void abrirPortas() {
        System.out.println("Abrindo " + portas + " portas do carro " + modelo + ".");
    }
}

// 2. Subclasse Moto
class Moto extends Veiculo {
    private boolean temBagageiro;

    // Construtor da Moto
    public Moto(String modelo, int ano, boolean temBagageiro) {
        super(modelo, ano); // Chama o construtor da superclasse
        this.temBagageiro = temBagageiro;
    }

    // Método empinar
    public void empinar() {
        System.out.println("A moto " + modelo + " está empinando!");
    }
}

// 3. Classe Principal (Main)
public class Main {
    public static void main(String[] args) {
        // Instanciando um carro
        Carro meuCarro = new Carro("Honda Civic", 2024, 4);

        // Instanciando uma moto
        Moto minhaMoto = new Moto("Yamaha MT-07", 2023, false);

        // Chamando os métodos do carro
        System.out.println("--- Ações do Carro ---");
        meuCarro.ligar();
        meuCarro.abrirPortas();

        System.out.println("\n--- Ações da Moto ---");
        // Chamando os métodos da moto
        minhaMoto.ligar();
        minhaMoto.empinar();
    }
}