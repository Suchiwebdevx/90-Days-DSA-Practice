package OOps;

public class MissingNumber {

    static int findMissing(int[] arr, int n) {

        int totalSum = n * (n + 1) / 2;

        int arraySum = 0;

        for (int i = 0; i < arr.length; i++) {
            arraySum = arraySum + arr[i];
        }

        return totalSum - arraySum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};

        int n = 5;

        int result = findMissing(arr, n);

        System.out.println("Missing number = " + result);
    }
}