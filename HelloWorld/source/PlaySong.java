import java.util.Scanner;

public class PlaySong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Afspiller nuværende sang");
            System.out.println("Vil du tage denne sang af repeat? Svar 'ja' for at fjerne den.");

            if ("ja".equalsIgnoreCase(scanner.nextLine())) {
                break;
            }
        }

        System.out.println("Afspiller næste sang.");
    }
}
