
import java.util.Scanner; // biblioteca para ler entrada do usuario.
// Inicialização do Main exibindo linhas de texto padrão.
public class Main {
public static void main(String[] args) { // 'public':significa que o metodo pode ser acessado de qualquer lugar (inclusive pela JVM).
                                        // 'static':significa que não é necessário criar um objeto da classe para executar o metodo.
                                        // 'void':o metodo não retorna nenhum valor.
                                        // 'String[] args:são os argumentos passados pela linha de comando.

    System.out.print("Hello world, Java!"); // 'System.out.print':exibição da linha de texto no terminal.
    System.out.println("\n Bem vindo \n a \n programação \n com Java"); // 'println':exibição da linha de texto no terminal com formatação de quebra de linha.

    String nome = "Marciel"; // Criação das variaveis.
    int idade = 27;
    double nota = 8.5;

    System.out.printf("\n Nome: %s, Idade: %d \n", nome, idade); // 'printf':exibição formatada (%s - String, %d - Int, %f - double)
    System.out.printf("Nota final: %.2f \n", nota);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String Nome = scanner.nextLine();

    System.out.print("Digite sua idade: ");
    int Idade = scanner.nextInt();

    System.out.println("\nNome: " + nome + "\nIdade: " + idade);
    scanner.close();
    }
}
