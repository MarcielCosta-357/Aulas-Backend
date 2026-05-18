public class Conversor {

    // Metodo 1: converte Celsius para Fahrenheit
    // A fórmula de conversão é: (Celsius * 9/5) + 32
    public double converter(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    // Metodo 2: converte horas e minutos para o total em minutos
    // A fórmula é: (horas * 60) + minutos
    public int converter(int horas, int minutos) {
        return (horas * 60) + minutos;
    }
}