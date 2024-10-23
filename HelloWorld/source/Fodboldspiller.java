public class Fodboldspiller {
    private final String navn;
    private final int hojde;

    public Fodboldspiller(String navn, int hojde) {
        this.navn = navn;
        this.hojde = hojde;
    }

    public int getHojde() {
        return hojde;
    }

    public String getNavn() {
        return navn;
    }

    public static class Fodbold {
        public static void main(String[] args) {
            Hold hold = new Hold();
            hold.addPlayer(new Fodboldspiller("Messi", 170));
            hold.addPlayer(new Fodboldspiller("Ronaldo", 187));
            hold.addPlayer(new Fodboldspiller("Neymar", 175));

            System.out.printf("Gennemsnitshøjde: %.2f cm%n", hold.beregnGennemsnitsHojde());
        }
    }

    public static class Spiller{
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
