import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayManipulationProblems {

    static int[] reverseArray(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            int temp = arr[i];

            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;

        }

        return arr;

    }

    static int[] shiftElement(int arr[]) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {

            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr;
    }

    static void extremeElements(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {

            if (i == j) {
                System.out.println(arr[i]);
            } else {
                System.out.println(arr[i]);
                System.out.println(arr[j]);
            }

            i++;
            j--;
        }
    }

    static int findMode(int arr[]) {
        Map<Integer, Integer> frequecyMap = new HashMap<>();

        int maxCount = 0;
        int mode = arr[0];

        for (int num : arr) {

            int count = frequecyMap.getOrDefault(num, 0) + 1;
            frequecyMap.put(num, count);

            if (count > maxCount) {
                maxCount = count;
                mode = num;
            }

        }
        return mode;

    }

    static int[] getHighestAndLowestFreq(int arr[]) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        int maxFreqNum = arr[0];
        int maxCount = 0;

        int minCount = Integer.MAX_VALUE;
        int minFreqNum = arr[0];
        // Inserting data
        for (int num : arr) {

            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {

            int num = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                maxFreqNum = num;
            }
            if (count < minFreqNum) {
                minCount = count;
                minFreqNum = num;
            }
        }
        int ans[] = { maxFreqNum, minFreqNum };
        return ans;
    }

    static int[] sort0sAnd1s(int arr[]) {

        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (j > i) {

            if (arr[i] == 1 && arr[j] == 0) {

                int temp = arr[i];

                arr[i] = arr[j];
                arr[j] = temp;

            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }

    static int missigElement(int arr[], int length) {

        int xorSum = 0;
        for (int n : arr) {
            xorSum = xorSum ^ n;
        }
        for (int i = 0; i < length; i++) {
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }

    static int uniqueElement(int arr[]) {

        int xorSum = 0;
        for (int n : arr) {
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }

    public static void main(String args[]) {

        int[] arr = { 1,2,2,3,3 };

        System.out.println(uniqueElement(arr));

        // System.out.println(missigElement(arr, 7));








        // int arr[] = { 1,0,1,0,0,1 };

        // System.out.println(Arrays.toString(sort0sAnd1s(arr)));












        // int [] arr = {1,1,2,3,3,3,4,4,4,4,4,5,5,5,5,5};
        // int [] ans = getHighestAndLowestFreq(arr);
        // System.out.println(ans[0]);
        // System.out.println(ans[1]);
    }
}
