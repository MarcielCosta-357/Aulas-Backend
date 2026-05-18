public class Main {
    public static void main(String[] args) {
        // Criando um objeto Motor
        Motor motorV8 = new Motor(500, "V8 a Gasolina");

        // Criando um objeto Carro que utiliza o motor criado
        Carro meuCarro = new Carro("Ford Mustang", motorV8);

        // Chamando os métodos para ligar e desligar o carro
        System.out.println("--- Ligando o veículo ---");
        meuCarro.ligarCarro();

        System.out.println("--- Desligando o veículo ---");
        meuCarro.desligarCarro();
    }
}