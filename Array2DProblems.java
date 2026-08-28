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
    public static int[][] rotate90ClockWise(int arr[][] , int N){

        //step 1:- transpose
     for(int row =0; row < N ;row++){
        for (int col = row+1; col < N; col++) {
            int temp = arr[row][col];
            arr[row][col] = arr[col][row];
            arr[col][row]= temp;
        }
     }
     //step 2:- reverse the row

     for (int row = 0; row < N; row++) {
        int startCol=0;
        int endCol=N-1;

        while (startCol <= endCol) {

            int temp = arr[row][startCol];
            arr[row][startCol] = arr[row][endCol];
            arr[row][endCol] = temp;

            startCol++;
            endCol--;

        }
     }


     return arr;
    }

    public static List<Integer> spiralOrder(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;

        List<Integer> result = new ArrayList<>();

        int startCol = 0;
        int startRow = 0;
        int endCol = m-1;
        int endRow = n-1;
        
        while (startCol <= endCol && startRow <= endRow) {

            //starting col to ending col
            for (int i = startCol; i <= endCol; i++) {
                result.add(arr[startRow][i]);
            }
            startRow++;
            //starting row to ending row
            for (int i = startRow; i <= endRow; i++) {
                result.add(arr[i][endCol]);
            }
            endCol--;

            //ending col to starting col
            if(startRow <= endRow){

                for (int i = endCol; i >=startCol; i--) {
                result.add(arr[endRow][i]);

            }
            endRow--;
            }
            
            //ending row to starting row 
            if(startCol<=endCol){
                for (int i = endRow; i >= startRow; i--) {
                result.add(arr[i][startCol]);
            }
            startCol++;
            }
            

        }
        return result;
    }
    public static void main(String args[]){

          int arr[][] = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30},{31,32,33,34,35,36}};
          System.out.println(spiralOrder(arr));



        // int arr [][] = {{1,2,3},{4,5,6},{7,8,9}};
        // System.out.println(Arrays.deepToString(rotate90ClockWise(arr, 3)));




        // int ans[][] = transposeOfArray(arr);
        // System.out.println(Arrays.deepToString(ans));
       
        



    //  int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    //  System.out.println(printWaveOfMatrix(arr));


    // int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
    // System.out.println(colSum(arr));

    //  int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
    // System.out.println(rowSum(arr));
   }
}