import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Bog> bøger;

    public Library() {
        bøger = new ArrayList<>();
    }

    public void tilføjBog(String titel, String forfatter, int år) {
        bøger.add(new Bog(titel, forfatter, år));
        System.out.println("Library.Bog tilføjet: " + titel);
    }

    public void fjernBog(String titel) {
        for (Bog bog : bøger) {
            if (bog.getTitel().equalsIgnoreCase(titel)) {
                bøger.remove(bog);
                System.out.println("Library.Bog fjernet: " + titel);
                return;
            }
        }
        System.out.println("Library.Bog ikke fundet: " + titel);
    }

    public void visBøger() {
        if (bøger.isEmpty()) {
            System.out.println("Biblioteket er tomt.");
        } else {
            System.out.println("Bøger i biblioteket:");
            for (Bog bog : bøger) {
                System.out.println(bog.getTitel() + " af " + bog.getForfatter() + " (" + bog.getÅr() + ")");
            }
        }
    }

    public static void main(String[] args) {
        Library bibliotek = new Library();
        bibliotek.tilføjBog("Harry Potter", "J.K. Rowling", 1997);
        bibliotek.tilføjBog("Hobbitten", "J.R.R. Tolkien", 1937);
        bibliotek.tilføjBog("1984", "George Orwell", 1949);

        bibliotek.visBøger();
        bibliotek.fjernBog("Hobbitten");
        bibliotek.visBøger();
    }

    public static class Bog {
        private final String titel;
        private final String forfatter;
        private final int år;

        public Bog(String titel, String forfatter, int år) {
            this.titel = titel;
            this.forfatter = forfatter;
            this.år = år;
        }

        public String getTitel() {
            return titel;
        }

        public String getForfatter() {
            return forfatter;
        }

        public int getÅr() {
            return år;
        }
    }
}
