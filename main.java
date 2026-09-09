
package OOps;

class Animal {

    String name = "Tommy";

    void eat() {
        System.out.println("Animal is eating");
    }

    void displayName() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class main {

    public static void main(String args[]) {

        Dog d = new Dog();

        // Method inherited from Animal
        d.eat();

        // Method inherited from Animal
        d.displayName();

        // Dog's own method
        d.bark();
    }
}
