import java.util.*;

public class SortingAlgo{

    public static int[] bubbleSort(int arr[]){
 
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n ; j++) {
                if(arr[j]< arr[minIdx]){
                    minIdx = j;
                }
            }


            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx]  = temp;
        }
    }
    public static void insertionSort(int arr[]){

        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int curr = i;
            int currValue = arr[curr];
            int prev = i-1;
            while ( prev>=0 && currValue < arr[prev]) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1] = currValue;
        }
    }
    public static void main(String args[]){

        int arr [] = {4,1,5,2,3};
        insertionSort(arr);
        for (int value : arr) {
            System.out.print(value+" ");
        }



        // int arr[] = {5,4,1,2,3};

        // selectionSort(arr);
        // for(int value : arr){
        //     System.out.print(value +" ");
        // }



    // int ans[] = bubbleSort(arr);
    // System.out.println(Arrays.toString(ans));
}
}

