import java.util.ArrayList;
import java.util.List;

class Product {
    private final String name;
    private int quantity;
    private final double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void adjustQuantity(int amount) {
        quantity += amount;
    }

    public boolean isLowStock(int threshold) {
        return quantity <= threshold;
    }

    @Override
    public String toString() {
        return String.format("%s | Antal: %d | Pris: %.2f DKK", name, quantity, price);
    }
}

class Inventory {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Tilføjet: " + product.getName());
    }

    public void removeProduct(String name) {
        products.removeIf(p -> p.getName().equalsIgnoreCase(name));
        System.out.println("Fjernet: " + name);
    }

    public void showLowStock(int threshold) {
        System.out.println("Lavt lager:");
        products.stream()
                .filter(p -> p.isLowStock(threshold))
                .forEach(System.out::println);
    }

    public void display() {
        System.out.println("Lageroversigt:");
        products.forEach(System.out::println);
    }
}

class InventoryManager {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProduct(new Product("Laptop", 10, 9999.99));
        inventory.addProduct(new Product("Phone", 5, 599.99));
        inventory.addProduct(new Product("Tablet", 2, 299.99));

        inventory.display();
        inventory.removeProduct("Phone");
        inventory.display();
        inventory.showLowStock(3);
    }
}
