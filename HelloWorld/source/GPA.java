import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vælg en beregning:");
        System.out.println("1. GPA (US)");
        System.out.println("2. Karakter (DA)");

        int valg = scanner.nextInt();

        if (valg == 1) {
            beregnGPA(scanner);
        } else if (valg == 2) {
            beregnDanskKarakter(scanner);
        } else {
            System.out.println("Ugyldigt valg.");
        }
    }

    private static void beregnGPA(Scanner scanner) {
        System.out.print("Hvor mange fag har du? ");
        int antalFag = scanner.nextInt();
        double totalPoints = 0;

        for (int i = 0; i < antalFag; i++) {
            System.out.print("Indtast karakter for fag " + (i + 1) + ": ");
            int karakter = scanner.nextInt();
            totalPoints += konverterKarakterTilGPA(karakter);
        }

        double gpa = totalPoints / antalFag;
        System.out.printf("Din GPA er: %.2f%n", gpa);
    }

    private static void beregnDanskKarakter(Scanner scanner) {
        System.out.print("Indtast din GPA: ");
        double gpa = scanner.nextDouble();
        int karakter = konverterGPAtilKarakter(gpa);
        System.out.println("Din danske karakter er: " + karakter);
    }

    private static double konverterKarakterTilGPA(int karakter) {
        if (karakter == 12) return 4.0;
        if (karakter == 10) return 3.7;
        if (karakter == 7)  return 3.0;
        if (karakter == 4)  return 2.0;
        if (karakter == 2)  return 1.0;
        return 0.0;
    }

    private static int konverterGPAtilKarakter(double gpa) {
        if (gpa >= 4.0) return 12;
        if (gpa >= 3.7) return 10;
        if (gpa >= 3.0) return 7;
        if (gpa >= 2.0) return 4;
        if (gpa >= 1.0) return 2;
        return 0;
    }
}