package OOps;

abstract class VehicleMain {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends VehicleMain {

    void start() {
        System.out.println("Car starts with a key");
    }
}

class Main {

    public static void main(String[] args) {

        Car c = new Car();

        c.start();
        c.stop();
    }
}