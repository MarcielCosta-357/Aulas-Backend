public class ConversorTest {

    public static void main(String[] args) {
        // Criação do objeto conversor
        Conversor conversor = new Conversor();

        System.out.println("--- Testando Sobrecarga de Métodos ---");

        // Chamando o metodo converter(double celsius) [cite: 247, 249]
        double tempCelsius = 25.0;
        double tempFahrenheit = conversor.converter(tempCelsius);
        System.out.printf("%.1f °C equivalem a %.1f °F.\n", tempCelsius, tempFahrenheit);

        // Chamando o metodo converter(int horas, int minutos) [cite: 248, 249]
        int horas = 2;
        int minutos = 30;
        int totalMinutos = conversor.converter(horas, minutos);
        System.out.printf("%d horas e %d minutos equivalem a %d minutos totais.\n", horas, minutos, totalMinutos);
    }
}