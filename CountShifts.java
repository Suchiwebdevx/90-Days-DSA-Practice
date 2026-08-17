//Count the number of shifts in Insertion Sort

package InsertionSort;

public class CountShifts {
	
    public static void main(String[] args) {

        int[] arr = {5, 2, 4, 1};
        
        int shifts = 0;

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                
                j--;

                shifts++;
            }

            arr[j + 1] = key;
        }

        System.out.println("Number of shifts: " + shifts);
    }
}