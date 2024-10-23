public class Bankkonto {
    private int kontonummer;
    private String ejernavn;
    private double saldo;

    public Bankkonto(int kontonummer, String ejernavn, double saldo) {
        this.kontonummer = kontonummer;
        this.ejernavn = ejernavn;
        this.saldo = saldo;
    }

    public int getKontonummer() { return kontonummer; }
    public void setKontonummer(int kontonummer) { this.kontonummer = kontonummer; }

    public String getEjernavn() { return ejernavn; }
    public void setEjernavn(String ejernavn) { this.ejernavn = ejernavn; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public double indsaet(double beloeb) {
        return saldo += beloeb;
    }

    public double haev(double beloeb) {
        return beloeb > saldo ? -1 : (saldo -= beloeb);
    }

    @Override
    public String toString() {
        return String.format("Konto [Kontonummer: %d, Ejernavn: %s, Saldo: %.2f]", kontonummer, ejernavn, saldo);
    }

    public static void main(String[] args) {
        Bankkonto konto = new Bankkonto(987654, "Jackie Chan", 2000.00);
        System.out.println(konto);

        System.out.println("Indsætter 500- Ny saldo: " + konto.indsaet(500));
        System.out.println("Hæver 1000- Ny saldo: " + konto.haev(1000));
        System.out.println("Hæver 3000- Resultat: " + konto.haev(3000));
    }
}
