public class Airplane {

    private final String flightNumber, destination, departure, arrival;
    private final int delay;

    public Airplane(String flightNumber, String destination, String departure, String arrival, int delay) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.delay = delay;
    }

    public void printFlightDetails() {
        System.out.printf("Flight: %s | Destination: %s | Departure: %s | Arrival: %s | Delay: %d min%n",
                flightNumber, destination, departure, arrival, delay);
    }

    public static void main(String[] args) {
        Airplane[] flights = {
                new Airplane("10", "Spain", "12:30", "14:15", 0),
                new Airplane("14", "England", "13:10", "15:15", 0),
                new Airplane("33", "Denmark", "15:52", "17:19", 1)
        };

        for (Airplane flight : flights) {
            flight.printFlightDetails();
        }
    }
}
