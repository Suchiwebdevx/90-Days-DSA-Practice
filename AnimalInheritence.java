
package OOps;

class Cat {

    String color = "White";

    void eat() {
        System.out.println("The cat is eating");
    }
}

class dog extends Cat {

    String color = "Brown";

    dog() {
        System.out.println("My cat name is Jelly");
    }

    void displayDetails() {

        System.out.println("The breed of Dog is German Shepherd");
        System.out.println("Dog color: " + color);
        System.out.println("Cat color: " + super.color);
    }
}

public class AnimalInheritence {

    static {
        System.out.println("I love animals");
    }

    public static void main(String args[]) {

        dog d = new dog();

        d.eat();
        d.displayDetails();
    }
}
