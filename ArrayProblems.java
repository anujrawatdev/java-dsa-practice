public class ArrayProblems{
    static double getAverage(int[] arr){
        double sum = 0;
        for (int i : arr) {
            sum = sum +i;
        
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;

        //O(n) = time complexity (because we traverse on n size of array through for loop )
        //O(1) = space complexity (because we took constant space for variable)
    }    

    static int[] multiplyBy10(int arr[]){
        int n = arr.length;
        int newArray [] = new int[n];


      for(int i = 0 ; i < n; i++){
          int element = arr[i];
          int newElement = element*10;
          newArray[i] = newElement;
      }

      return newArray;
    }

    static int searchForElement(int arr[],int target){
        int n = arr.length;
       for(int i = 0 ; i < n; i++){
        
          if(arr[i] == target){
            return i;
          }
      }
      return -1;
    }

    static int findMaxNumber(int arr[]){
        int n = arr.length;
        int max = arr[0];
       for(int i = 1 ; i < n; i++){
        if(arr[i]>max){
            max = arr[i];
        }
        
      }
      return max;
      
    }

    static int[] positiveNegativeSum(int arr[]){
    
    int posSum = 0;
    int negSum =0;
      int n = arr.length;
      for(int i= 0; i<n;i++){

        if(arr[i]>0){
            posSum =posSum+arr[i];
        }
        else{
            negSum = negSum+arr[i];
        }
      }
      int ans[] = {posSum,negSum};
      return ans;
    }

    static int[] countOnesAndZeros(int arr[]){
        int count0 = 0;
        int count1 = 0;
        for(int i =0 ; i< arr.length;i++){
           if(arr[i]==0){
             count0++;
           }
           else{
            count1++;
           }
        }

        int ans[]={count0,count1};
        return ans;
    }

    static int firstUnsortedElement(int arr[]){
        
        int n = arr.length;

        for(int i =0; i < n-1;i++){

        if(arr[i]>arr[i+1]){
            return arr[i+1];
        }
        }
        return -1;
    }
        public static void main(String[] args){
            int [] arr = {1,2,3,6,4,7,8};
            
            System.out.println(firstUnsortedElement(arr));











            // int [] arr = {0,1,1,1,0,0,1,0,0};

            // int ans[] = countOnesAndZeros(arr);
            // System.out.println("count of zero  "+ans[0]);
            // System.out.println("count of ones  " +ans[1]);






            // int ans[] = positiveNegativeSum(arr);
            // System.out.println("positive Number Sum = "+ ans[0]);
            // System.out.println("positive Number Sum = "+ ans[1]);







            // int target = 7;

            // int result = searchForElement(arr, target);

            // if(result!=-1){
            //     System.out.println("Element "+target+" index "+result);
            // }
            // else{
            //     System.out.println("element not found");
            // }










            // int [] result = multiplyBy10(arr);
            
            // for (int i : result) {
            //     System.out.println( i  + " ");
            // }









            // int result = findMaxNumber(arr);
            // System.out.println(findMaxNumber(arr));






        }
    
} 

