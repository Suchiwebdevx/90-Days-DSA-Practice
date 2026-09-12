package OOps;

interface Animal {

    void eat();

    void sound();
}

class Dog implements Animal {

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sound() {
        System.out.println("Dog is barking");
    }
}

 class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.sound();
    }
}