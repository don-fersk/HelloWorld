public class Bil {
    private final String maerke;
    private final String model;
    private final int aar;

    public Bil(String maerke, String model, int aar) {
        this.maerke = maerke;
        this.model = model;
        this.aar = aar;
    }

    public void start() {
        System.out.println(maerke + " " + model + " starter.");
    }

    public void stop() {
        System.out.println(maerke + " " + model + " stopper.");
    }

    public void tilfoejService(String service) {
        System.out.println("Service tilføjet: " + service);
    }

    public void visInfo() {
        System.out.println(maerke + " " + model + " fra " + aar);
    }

    public static void main(String[] args) {
        Bil minBil = new Bil("Tesla", "Model S", 2023);
        minBil.start();
        minBil.visInfo();
        minBil.tilfoejService("Olieskift");
        minBil.stop();
    }
}
