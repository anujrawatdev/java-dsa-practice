import java.util.*;

public class BinarySearch{


    public static int binarySearch(int arr[],int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = start + (end-start)/2;

        while (start <= end) {
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
               start = mid + 1;
            }
            else{
                end = mid - 1;
            }

            mid = start + (end - start)/2;
        }
        return -1;
    }

public static void main(String[] args) {
    int arr[] = {11,12,13,14,15,16,17,18,20,23,25,26,27};

   System.out.println(binarySearch(arr,12));

}

}

