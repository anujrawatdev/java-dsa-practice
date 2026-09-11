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
    public static int peakElementInArray(int arr[]){
     
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;

        while (s<=e) {
            int mid = s + (e-s)/2;
            if( arr[mid]<arr[mid+1] ){
                s = mid + 1;
            }
            else{
                e = mid-1;
                ans = mid;
            }
        }
    return ans;
    }

    public static int pivotIndexInRotatedArray(int arr[]){
        int n = arr.length;
        int s = 0 ;
        int e = n-1;
        int ans =-1;

        while (s<=e) {
            int mid = s +(e-s)/2;
            if(arr[mid] <= arr[n-1]){
                e = mid-1;
            }
            else{
                s = mid+1;
                ans = mid;
            }
        }
        return ans;
    }

    public static int binarySearch2(int arr[],int s , int e , int target){

        int ans = -1;
        while (s<=e) {
            int mid = s +(e-s)/2;

            if(arr[mid] == target){
                ans = mid;
               return mid;
            }

            else if(arr[mid] < target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }

        }
        return ans;
    }
    public static int searchInRotatedSortedArray(int arr[], int target){

        int n = arr.length;
        int pivotidx = pivotIndexInRotatedArray(arr);

        //if array is sorted
        if(pivotidx == -1){
           int ans =binarySearch2(arr, 0, n-1 , target);
           return ans;
        }

       //if array is not sorted or rotated
       else{

       int startArray1 = 0;
       int endArray1 = pivotidx;
       int startArray2 = pivotidx+1;
       int endArray2 = n-1;

       if(target>=arr[startArray1] && target<=arr[endArray1]){
        int ans  = binarySearch2(arr, startArray1, endArray1, target);
        return ans;
       }
       else{
        int ans = binarySearch2(arr, startArray2, endArray2, target);
        return ans;
       }
       }

    }

    public static double sqrRootWithBinarySearch(int n , int precisionNumber){
        int s = 0 ;
        int e = n;
        double ans = -1;
        double factor =1;
        
        if(n == 0){
            return 0 ;
        }
        while (s <= e) {
            int mid = s + (e-s)/2;

            if(mid*mid == n){
                return mid;
            }

            else if(mid*mid > n ){
                e = mid-1;
            }

            else{
                ans = mid;
                s = mid +1 ;
            }
        }
        for (int i = 0 ; i < precisionNumber; i ++){
            
            factor = factor / 10;
            for( int j = 0 ; j < 10;j++){

              double newAns = ans + factor;

              if(newAns*newAns == n){
                return newAns;
              }
              if(newAns*newAns < n){
                 ans = Math.round(newAns*1000.0)/1000.0;
              }
              else{
                //newAns*newAns > n
                 break;
              }
            }
        }
        return ans;
    }
public static void main(String[] args) {

      int n = 100;
      int precisionNumber = 3;
      System.out.println(sqrRootWithBinarySearch(n, precisionNumber));


    // int arr[] = {50,60,70,80,10,20,30,40};
    // int target = 10;
    // System.out.println(searchInRotatedSortedArray(arr,target));





    // int arr [] = {50,60,70,80,10,20,30,40};
    // System.out.println(pivotIndexInRotatedArray(arr));


    // int arr [] = {10,20,30,40,50,60,70,35,25};
    // System.out.println(peakElementInArray(arr));


    // int arr[] = {10,20,30,30,30,30,30,70,70,80};
    // int target = 30;
    // int ans = totalOccurence(arr, target);
    // System.out.println("ans "+ans);


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

