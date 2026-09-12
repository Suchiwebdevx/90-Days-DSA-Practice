package OOps;

class Product {

    void buy(int quantity) {
        System.out.println("Buying " + quantity + " products");
    }

    void buy(int quantity, String coupon) {
        System.out.println("Buying with coupon");
    }
}
class Payment {

    void pay() {
        System.out.println("Making payment");
    }
}

class UPI extends Payment {

    @Override
    void pay() {
        System.out.println("Payment through UPI");
    }
}