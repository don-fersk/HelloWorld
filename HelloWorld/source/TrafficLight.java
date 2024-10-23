public class TrafficLight {
    private String color;

    public TrafficLight() {
        System.out.println("HEADS UP! \n");
    }

    public void startCycle() throws InterruptedException {
        Thread.sleep(2500);
        System.out.println("\n".repeat(30));

        String[] colors = {"GREEN", "YELLOW", "RED"};
        for (String c : colors) {
            color = c;
            System.out.println(color);
            Thread.sleep(5000);
        }
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        try {
            trafficLight.startCycle();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
