import java.util.*;

public class Array2DProblems{
   
    public static List<Integer> rowSum(int [][] arr){

        List<Integer> result = new ArrayList<>();

        
        int n = arr.length;
        int m = arr[0].length;

        for(int i = 0; i < n; i++){
            
            int sum =0;
            for(int j = 0 ; j < m; j++){
                int value = arr[i][j];
                sum = sum + value;
                
            }

            result.add(sum);
        }
        return result ;
    }
   
    public static List<Integer> colSum(int [][] arr){

        List<Integer> result = new ArrayList<>();

        
        int n = arr.length;
        int m = arr[0].length;

        for(int col = 0; col < m; col++){
            
            int sum =0;
            for(int row = 0 ; row < n; row++){
                int value = arr[row][col];
                sum = sum + value;
                
            }

            result.add(sum);
        }
        return result ;
    }
   
    public static List<Integer> printWaveOfMatrix(int arr[][]){

        List<Integer> result = new ArrayList<>();

      int n = arr.length;
      int m = arr[0].length;
      for(int j = 0 ; j < m; j++){
        if( j %2 == 0){
            for(int i = 0; i < n ; i++){

              int value = arr[i][j];
              result.add(value);
            }
        }
        else{
            for(int i = n-1; i >= 0 ; i--){

              int value = arr[i][j];
              result.add(value);
            }
        }
      }
      return result;
    } 
    
    public static int[][] transposeOfArray(int arr[][]){
      
        int totalRows = arr.length;
        int totalCols = arr[0].length;

        int newTotalRows = totalCols;
        int newTotalCols = totalRows;

        int ans[][] = new int[newTotalRows][newTotalCols];

        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
    }
    public static void main(String args[]){


        int arr [][] = {{1,2,3},{4,5,6},{7,8,9}};
        int ans[][] = transposeOfArray(arr);
        System.out.println(Arrays.deepToString(ans));
       
        



    //  int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    //  System.out.println(printWaveOfMatrix(arr));


    // int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
    // System.out.println(colSum(arr));

    //  int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
    // System.out.println(rowSum(arr));
   }
}