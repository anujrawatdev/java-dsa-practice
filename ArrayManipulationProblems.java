import java.util.Arrays;

public class ArrayManipulationProblems {

    static int[] reverseArray(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while (i <= j) {
            int temp = arr[i];

            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;

        }

        return arr;

    }

    public static void main(String args[]) {

        int[] arr = { 1, 4, 5, 6, 7, 8 };
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
