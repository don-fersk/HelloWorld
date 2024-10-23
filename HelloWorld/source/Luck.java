import java.util.Scanner;

public class Luck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vælg et tal mellem 1 og 10: ");
        int number = scanner.nextInt();

        String message;
        if (number < 5) {
            message = "1. Du får glæde af en ven, der bringer lykke!";
        } else {
            message = "2. Du er selv lykken for dine venner!";
        }

        System.out.println(message);
    }
}
