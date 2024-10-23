import java.util.ArrayList;
import java.util.List;

public class Hold {
    private final List<Fodboldspiller> spillere;

    public Hold() {
        spillere = new ArrayList<>();
    }

    public void addPlayer(Fodboldspiller spiller) {
        spillere.add(spiller);
    }

    public double beregnGennemsnitsHojde() {
        if (spillere.isEmpty()) {
            return 0;
        }
        int totalHojde = 0;
        for (Fodboldspiller spiller : spillere) {
            totalHojde += spiller.getHojde();
        }
        return (double) totalHojde / spillere.size();
    }

    public static class Spiller {
        public static void main(String[] args) {
            Hold hold = new Hold();

            hold.addPlayer(new Fodboldspiller("Messi", 170));
            hold.addPlayer(new Fodboldspiller("Ronaldo", 187));

            // Tilføj en ny spiller som beskrevet i opgaven
            hold.addPlayer(new Fodboldspiller("Neymar", 175));

            // Udskriv gennemsnitshøjden af alle spillere
            System.out.printf("Gennemsnitshøjde: %.2f cm%n", hold.beregnGennemsnitsHojde());
        }
    }
}
