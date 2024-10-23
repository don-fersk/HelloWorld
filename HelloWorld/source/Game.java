import java.util.Random;
import java.util.Scanner;

abstract class Tamagotchi {
    String navn;
    int alder;
    String stemning;
    int energi;

    public Tamagotchi(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
        this.stemning = "glad";
        this.energi = 100;
    }

    public abstract void play();

    public void feed() {
        System.out.println(navn + " bliver fodret.");
        energi = Math.min(100, energi + 20);
        stemning = "mæt!";
    }

    public void sleep() {
        System.out.println(navn + " sover!");
        energi = 100;
        stemning = "udhvilet.";
    }
}

class Kat extends Tamagotchi {
    public Kat(String navn, int alder) {
        super(navn, alder);
    }

    @Override
    public void play() {
        System.out.println(navn + " katten jagter en mus!");
        energi = Math.max(0, energi - 15);
        stemning = "legesyg.";
    }

    public void meow() {
        System.out.println(navn + " siger MEOW!");
    }
}

class Hund extends Tamagotchi {
    public Hund(String navn, int alder) {
        super(navn, alder);
    }

    @Override
    public void play() {
        System.out.println(navn + " hunden jagter bolden!");
        energi = Math.max(0, energi - 20);
        stemning = "ophidset.";
    }

    public void goe() {
        System.out.println(navn + " siger VOV!");
    }
}

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hej! Vil du have en hund eller kat? (1 for hund, 2 for kat)");
        int choice = sc.nextInt();

        Tamagotchi pet;
        if (choice == 1) {
            System.out.print("Hvad skal din hund hedde? ");
            String name = sc.next();
            pet = new Hund(name, random.nextInt(15) + 1);
            System.out.println("Mød din hund, " + name + "!");
            ((Hund) pet).goe();
        } else if (choice == 2) {
            System.out.print("Hvad skal din kat hedde? ");
            String name = sc.next();
            pet = new Kat(name, random.nextInt(15) + 1);
            System.out.println("Mød din kat, " + name + "!");
            ((Kat) pet).meow();
        } else {
            System.out.println("Ugyldigt valg. Prøv igen.");
            return;
        }

        while (true) {
            System.out.println("\nHvad vil du gøre? (1 - Spil, 2 - Fodre, 3 - Sove, 4 - Forlad)");
            int action = sc.nextInt();
            switch (action) {
                case 1 -> pet.play();
                case 2 -> pet.feed();
                case 3 -> pet.sleep();
                case 4 -> {
                    System.out.println("Farvel!");
                    return;
                }
                default -> System.out.println("Ugyldigt valg. Prøv igen.");
            }

            System.out.println("\n--- Status ---");
            System.out.println("Navn: " + pet.navn);
            System.out.println("Alder: " + pet.alder + " år");
            System.out.println("Stemning: " + pet.stemning);
            System.out.println("Energi: " + pet.energi + "%");
        }
    }
}
