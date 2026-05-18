import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {
        // Criação do objeto Scanner para ler as entradas na consola
        Scanner input = new Scanner(System.in);

        // Criação do objeto myGradeBook da classe GradeBook
        GradeBook myGradeBook = new GradeBook();

        // Solicita ao utilizador que introduza o nome do curso
        System.out.println("Por favor, introduza o nome do curso:");
        String nomeDoCurso = input.nextLine(); // Lê a linha de texto introduzida

        System.out.println(); // Imprime uma linha em branco para melhor leitura

        // O objeto chama o metodo da classe passando a variável como argumento
        myGradeBook.displayMessage(nomeDoCurso);

        // Boa prática: fechar o scanner
        input.close();
    }

}