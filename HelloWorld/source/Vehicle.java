public class Vehicle {
    private final String make;
    private final String model;
    private final int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Mærke: " + make + ", Model: " + model + ", År: " + year);
    }

    public static class Car extends Vehicle {
        private final double trunkSize;

        public Car(String make, String model, int year, double trunkSize) {
            super(make, model, year);
            this.trunkSize = trunkSize;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Bagagerum: " + trunkSize + " kubikfod");
        }
    }

    public static class Truck extends Vehicle {
        private final double payload;

        public Truck(String make, String model, int year, double payload) {
            super(make, model, year);
            this.payload = payload;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Nyttelast: " + payload + " tons");
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 15.4);
        Truck truck = new Truck("Ford", "F-150", 2018, 1.5);

        System.out.println("Bil Detaljer:");
        car.displayDetails();

        System.out.println("\nLastbil Detaljer:");
        truck.displayDetails();
    }
}
