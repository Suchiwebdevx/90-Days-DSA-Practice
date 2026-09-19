package OOps;

public class Product {

    String name;
    double price;
    int quantity;

    void calculateTotal() {

        double total = price * quantity;

        System.out.println("Product: " + name);
        System.out.println("Total Price: " + total);
    }

    public static void main(String[] args) {

        Product p = new Product();

        p.name = "Laptop";
        p.price = 50000;
        p.quantity = 2;

        p.calculateTotal();
    }
}