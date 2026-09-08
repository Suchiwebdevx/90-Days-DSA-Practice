package OOps;

public class EvenOddStatic {

    static void checkEvenOdd(int n) {

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        checkEvenOdd(10);
        checkEvenOdd(7);
    }
}
