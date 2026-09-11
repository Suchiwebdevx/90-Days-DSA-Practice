package OOps;

class CompositionOOps {

    void display() {
        System.out.println("This is a room");
    }
}

class House {

    CompositionOOps room = new CompositionOOps();

    void displayHouse() {
        System.out.println("This is a house");
        room.display();
    }
}
class CompositionMain {

    public static void main(String[] args) {

        House h = new House();

        h.displayHouse();
    }
}