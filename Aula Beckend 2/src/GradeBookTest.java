import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GradeBook myGradeBook = new GradeBook();

        System.out.println("Por favor, introduza o nome do curso:");
        String nomeDoCurso = input.nextLine();

        System.out.println();

        myGradeBook.displayMessage(nomeDoCurso);

        input.close();
    }

}