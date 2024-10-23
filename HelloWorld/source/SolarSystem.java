import java.util.Scanner;

public class SolarSystem {
    public static void main(String[] args) {
        String question = "Hvilken planet er den største i vores solsystem?";
        String[] choices = {"jord", "jupiter", "saturn"};
        String correctAnswer = choices[1]; // Jupiter

        System.out.println(question);
        System.out.println("Vælg en af følgende: " + String.join(", ", choices) + ".");

        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine().toLowerCase();

        System.out.println("Dit svar: " + userAnswer);
        System.out.println("Korrekt svar: " + correctAnswer);

        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Du har ret!");
        } else {
            System.out.println("Desværre, det er forkert.");
        }
    }
}
