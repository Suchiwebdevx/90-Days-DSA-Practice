package OOps;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers);

        System.out.println("First element: " + numbers.get(0));

        numbers.remove(2);

        System.out.println(numbers);
    }
}