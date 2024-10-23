public class Dyr {
    private final String navn, art, farve, diæt;

    public Dyr(String navn, String art, String farve, String diæt) {
        this.navn = navn;
        this.art = art;
        this.farve = farve;
        this.diæt = diæt;
    }

    public void visInfo() {
        System.out.printf("Navn: %s, Art: %s, Farve: %s, Diæt: %s%n", navn, art, farve, diæt);
    }

    public static void main(String[] args) {
        Dyr kat = new Dyr("Pooby", "Cotton", "Brun", "Lasagne");
        kat.visInfo();
    }
}
