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

    public static int lowerBound(int arr[], int target ){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = n ;
        while (start<=end) {
            int mid = start + (end - start)/2;

            if(arr[mid] >=target){
               ans = mid;

               end = mid -1;
            }
            else{
              start = mid + 1;
            }
        }
         
        return ans;

    }

    public static int upperBound(int arr[] , int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = n ;

        while (start<= end) {

            int mid = start +(end-start)/2;
            if(arr[mid] > target){
             
                ans = mid;
             
                end = mid-1;
            
            }
            else{
               start = mid + 1;
            }
        }
        return ans;
    }

    public static int totalOccurence(int arr[],int target){
        int lowerBound = lowerBound(arr, target);
        int upperBound = upperBound(arr, target);
        int ans = upperBound - lowerBound;
        return ans;
    }
public static void main(String[] args) {

    int arr[] = {10,20,30,30,30,30,30,70,70,80};
    int target = 30;
    int ans = totalOccurence(arr, target);
    System.out.println("ans "+ans);


//     int arr[] = {10,20,30,30,30,30,70,80};
//     int target = 30;
//     int ans = upperBound(arr,target);
//    System.out.println("ans:" + ans);

//     int arr[] = {10,20,30,30,30,40,40,50,60};
//     int target = 30;
//     int ans = lowerBound(arr,target);
//    System.out.println("ans:" + ans);

}

}

