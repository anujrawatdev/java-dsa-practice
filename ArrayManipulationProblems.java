import java.lang.reflect.Array;
import java.util.*;


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

    static int[] pairSumIsEqualToTarget(int arr[]) {
        int n = arr.length;
        int target = 9;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == target) {
                    int pair[] = { arr[i], arr[j] };
                    return pair;
                }

            }
        }
        int ans[] = {};
        return ans;
    }

    public static List<List<Integer>> threeSum(int arr[]) {

        Set<List> output = new HashSet<>();

        int n = arr.length;
        int target = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {

                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        output.add(temp);
                    }

                }

            }
        }
        return new ArrayList<>(output);
    }

    static int removeDuplicate(int arr[]){
        int n = arr.length;
        int i = 0;
        int j = 1;
        while(j < n){
            if(arr[i]==arr[j]){
                j++;
            }
            else{
                i++;
                arr[i]=arr[j];
                j++;
            }
        }
        return i+1;
    }

    public static int findFirstRepeatingElement(int arr[]){
        Map<Integer,Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for (int i : arr) {
            if(freq.get(i) > 1 ){
               return i;
            }
        }
        return -1;
    }
    public static int pivotIndex(int arr[]){
     
        int n = arr.length;

        int leftSum [] = new int[n];
        int rightSum [] = new int[n];

        leftSum[0] = arr[0];
        rightSum[n-1] = arr[n-1];

        for (int i = 1; i < n; i++) {

            leftSum[i] = leftSum[i-1]+arr[i];
            
        }

        for (int i = n-2; i >= 0 ; i--) {

            rightSum[i] = rightSum[i+1]+arr[i];
            
        }

        for (int i = 0; i < n; i++) {
            if(leftSum[i] == rightSum[i]){
            return i;
        }
        }
    return -1;
    }

    public static int missngElement(int arr[]){

        Map <Integer,Integer> freq = new HashMap<>();

        int n = arr.length;

        for(int num:arr){

            freq.put(num, freq.getOrDefault(num, 0)+1);

        }

        for (int i = 1; i <= n; i++) {
           if(!freq.containsKey(i)){
            return i;
           }
        }

        return -1;
    }

    public static int maximumSubarray(int[] arr ){
       int sum = 0;
       int maxi= Integer.MIN_VALUE;

       for (int i = 0; i < arr.length; i++) {
           sum = sum + arr[i];

           if(sum>maxi){
            maxi = sum;
           }

           if(sum<0){
            sum = 0;
           }
       }
       return maxi;
    }

    public static void main(String args[]) {




        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarray(arr));
        // int [] arr = {1,4,4,5,2,6};
        // System.out.println(missngElement(arr));














    //  int [] arr= {12,19,2,-20,6,14,-1};
    //  System.out.println(pivotIndex(arr));












        // int[] arr={10,5,3,4,3,5,6};
        // System.out.println(findFirstRepeatingElement(arr)); 






        // int[] arr = { 1,2 , 2, 2, 2,3,3,4,5 };
        // System.out.println(removeDuplicate(arr));



        // System.out.println(threeSum(arr));





        // int[] arr = { 1,2,2,3,3 };

        // System.out.println(uniqueElement(arr));

        // System.out.println(missigElement(arr, 7));

        // int arr[] = { 1,0,1,0,0,1 };
        // System.out.println(Arrays.toString(sort0sAnd1s(arr)));

        // int [] arr = {1,1,2,3,3,3,4,4,4,4,4,5,5,5,5,5};
        // int [] ans = getHighestAndLowestFreq(arr);
        // System.out.println(ans[0]);
        // System.out.println(ans[1]);
    }
}
