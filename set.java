public class Main {
    public static void main(String[] args) {

        // 1. ArithmeticException
        try {
            int x = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled");
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "ArrayIndexOutOfBoundsException handled");
        }

        // 3. NullPointerException
        try {
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }
}
