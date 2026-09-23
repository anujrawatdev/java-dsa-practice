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

    public static boolean isValidAns(int arr[], int k, int mid){

        

        int pages =0;
        int studentCount = 1;

        for (int i = 0; i < arr.length; i++) {
            if(pages + arr[i] <= mid){
                pages = pages+ arr[i];
            }
            else{
                studentCount++;
                if(studentCount > k || arr[i] > mid){
                    return false;
                }
                else{
                    pages = 0;
                    pages = pages+ arr[i];
                }
            }
        }
        return true;
    }
    public static int bookAllocation(int arr[],int k){

        if (k > arr.length) {
            return -1;
        }

        int s = 1;
        int n = arr.length;
        int sum = 0 ;
        int ans = -1;
    
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        int e = sum;

        while (s <= e) {
            int mid = s + (e-s)/2;
            if(isValidAns(arr,k,mid)){
               e = mid-1;
               ans = mid;
            }
            else{
                s = mid + 1;
            }
        }
    return ans;
    }

    public static boolean isValidSolution(int arr[],int k , int mid){

        int painterCount = 1;
        int paintedLength = 0;

        for (int i = 0; i < arr.length; i++) {
            if(paintedLength+arr[i] <= mid ){
                paintedLength = paintedLength +arr[i];
            }
            else{

                painterCount++;
                

                if(arr[i]>mid || painterCount>k){
                    return false;
                }
                else{
                    paintedLength = 0;
                    paintedLength = paintedLength + arr[i];
                }
            }
        }
        return true;
    }
    public static int paintingBoard(int arr[], int k){
        int n = arr.length;
        int s =0;
        int sum = 0;
        int ans = -1;


        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int e = sum;

        while (s<=e) {
            int mid = s +(e-s)/2;
            if(isValidSolution(arr,k,mid)){
              ans = mid;
              e = mid-1;
            }
            else{
               s = mid+1;
            }
        }
        return ans;
    }

    public static boolean isValidSol(int arr[],int k ,int mid){
        int cowCounter = 1;
        int lastPosition = 0;

       for (int i = 1; i < arr.length; i++) {
        if(arr[i]-arr[lastPosition] >= mid){
            cowCounter++;
            lastPosition = i;

            if(cowCounter == k){
               return true;
            }
        }
       }
       return false;
    }
    public static int agressiveCows(int arr[],int k){

        Arrays.sort(arr);
        int n = arr.length;
        int s = 0 ;
        int e = arr[n-1] - arr[0];
        int ans = -1;
        
        while (s<=e) {
            int mid = s + (e-s)/2;

            if(isValidSol(arr,k,mid)){
                ans = mid;
                s = mid+1;
            }
            else{
                e = mid - 1;
            }

        }
        return ans;
    }

    public static boolean isValidSoln(int arr[],int m ,int mid){
        int totalWoodCollected = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= mid){
                int currentWoodCollected = arr[i]-mid;

            totalWoodCollected += currentWoodCollected;
            }
            
        }
        if(totalWoodCollected >= m){
            return true;
        }
        else{
            return false;
        }
    }
    public static int EKOSPOJ(int arr[],int m){
        int n = arr.length;
        int s = 0 ;
        int maxi =-1;
        int ans = -1;

        for (int i = 0; i < n ; i++) {
            if(maxi<arr[i]){
                maxi =arr[i];
            }
        }

        int e = maxi;

        while (s<=e) {
            int mid = s +(e-s)/2;

            if(isValidSoln(arr,m,mid)){
                ans = mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }

    public static boolean validAns(int arr[],int mid , int totalparatas , int cooks){
       
        int parataCount = 0;
        
        for (int i = 0; i < arr.length; i++) {

            int currentCookRank = arr[i];
            int timeTaken = 0;
            int j = 1;
            
            while (timeTaken + j * currentCookRank <= mid) {
                timeTaken = timeTaken + j*currentCookRank;
                parataCount++;
                j++;
                
                if(parataCount >= totalparatas){
                    return true;
                }
            }

        }
        return false;
    }

    public static int rotiParata(int p ,int arr[], int c){
        // p -> number of paratas to cook 
        // n -> number of cooks

        int maxRank = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxRank){
                maxRank = arr[i]; 
            }
        }

        int s = 0 ;
        int ans = -1;
        int e = maxRank * (p * (p+1)/2);

        while(s<=e){
            int mid = s+(e-s)/2;

            if(validAns(arr, mid , p , c)){
               ans = mid;
               e = mid -1;

            }else{
              s = mid+1;
            }
        }
        return ans;
    }
    public static int findElementInNearlySortedArr(int arr[],int k){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        while (s<=e) {
            int mid = s+(e-s)/2;
            if(arr[mid] == k){
                return mid;
            }
            if( mid-1 >= 0 && arr[mid-1] == k ){
                return mid-1;
            }
            if( mid < n-1 && arr[mid+1] == k){
                return mid+1;
            }

            if( arr[mid] < k ){
                s = mid +1;
            }
            else{
                e = mid-1;
            }
        }
        return -1;
    }

       public static int findSingleNonDuplicate(int arr[]){
        int n = arr.length;
        int s = 0;
        int e = n-1;

        
        if(s == e ){
          return arr[s];
        }

        while(s<=e){
            int mid = s + (e-s)/2;

            if(mid == 0){
            if(arr[mid] != arr[mid+1]){

                return arr[mid];
                
            }
            s = mid + 1;
        }
        if(mid == n-1){
           if(arr[mid] != arr[mid-1]){
            return arr[mid];
           }
           e = mid-1;
        }

            int currentValue = arr[mid];
            int prevValueIndex = arr[mid-1];
            int nextValueIndex = arr[mid+1];

            if(currentValue != prevValueIndex && currentValue != nextValueIndex){
                return currentValue;
            }

            if(currentValue != prevValueIndex && currentValue == nextValueIndex){
                int startingIndexOfPair = mid;
                if(startingIndexOfPair % 2 == 1){
                   e = mid-1;
                }
                else{
                    s = mid+1;
                }
            } 
            else if( currentValue == prevValueIndex && currentValue != nextValueIndex){
                int endingIndexOfPair = mid;
                if (endingIndexOfPair % 2 == 1) {
                    s = mid+1;
                }
                else{
                    e = mid-1;
                }
            }

        }
        return -1;
    }
    public static boolean SearchIn2DString(int arr[][],int target){
        
        int totalRows = arr.length;
        int totalCols = arr[0].length;
        int n = totalRows*totalCols;

        int s = 0;
        int e = n-1;


        while(s<=e){
            int mid = s +(e-s)/2;
            int row = mid/totalCols;
            int col = mid%totalCols;

            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col] < target){
                 s = mid +1;
            }
            else{
                e = mid-1;
            }

        }
        return false;
    }

    public static boolean searchMatrix(int arr[][], int target ){
        int totalRows = arr.length;
        int totalCols = arr[0].length;
        

        int row = 0;
        int col = totalCols-1;

        while(row < totalRows && col >=0){
            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }


    public static int OccOfOne(int arr[][], int row){

        int totalRows = arr.length;
        int totalCols = arr[0].length;

        int s = 0;
        int e = totalCols -1;
        int ans = totalCols;
        
        while (s<=e) {
            int mid = s +(e-s)/2;

            if(arr[row][mid] == 0){
               s = mid+1;
            }
            else{
                ans = mid; 
                e = mid-1;
            }
        }
        return ans;
    }

    public static int maximum1InRow(int arr[][]){

        int totalRows = arr.length;
        int totalCols = arr[0].length;
        int max =-1;
        int maxRow=-1;

        for (int row = 0; row < arr.length; row++) {
            int oneCount = totalCols - OccOfOne(arr, row);
            
            if(oneCount>max){
                max = oneCount;
                maxRow = row;
            }
            
        }
       return maxRow;
    }

public static void main(String[] args) {

   int arr[][] = {
    {1, 1, 1, 1, 1},
    {0, 1, 1, 1, 1},
    {0, 0, 1, 1, 1},
    {1, 1, 1, 1, 1}
};

    System.out.println(maximum1InRow(arr));

    // int arr[][] = {
    //     {1,4,7,11,15},
    //     {2,5,8,12,19},
    //     {3,6,9,16,22},
    //     {10,13,14,17,27},
    //     {18,21,23,26,30}
    // };
    // System.out.println(searchMatrix(arr, 15));

    // int arr[][] = {
    //     {1,3,5,7},
    //     {10,11,16,20},
    //     {23,30,34,60}
    // };
    // System.out.println(SearchIn2DString(arr, 3));

    // int arr[] = {1,1,2,2,3};
    // System.out.println(findSingleNonDuplicate(arr));




    // int arr[] = {3,5,10,9,11};
    // int k =10;
    // System.out.println(findElementInNearlySortedArr(arr, k));





    // int arr[] = {1,2,3,4};
    // int p = 10;
    // int c = 4;
    // System.out.println(rotiParata(p, arr, c));




    // int arr[]={20,15,10,17};
    // int m = 7;
    // System.out.println(EKOSPOJ(arr, m));





    // int arr[]={1,2,4,8,9};
    // int k = 3;
    // System.out.println(agressiveCows(arr, k));




        
    // int arr[] = {10,20,30,40};
    // int k = 2;
    // System.out.println(paintingBoard(arr, k));






    //  int arr[]={12,34,67,90};
    //  int k =3;
    //  System.out.println(bookAllocation(arr, k));




    //   int n = 100;
    //   int precisionNumber = 3;
    //   System.out.println(sqrRootWithBinarySearch(n, precisionNumber));




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

