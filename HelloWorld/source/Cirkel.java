public class Cirkel {
    private final double radius;

    public Cirkel(double radius) {
        this.radius = radius;
    }

    public double areal() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Cirkel cirkel = new Cirkel(7.5);
        System.out.println("Arealet af cirklen er: " + cirkel.areal());
    }
}
