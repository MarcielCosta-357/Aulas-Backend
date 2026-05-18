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