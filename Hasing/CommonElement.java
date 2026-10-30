package Hasing;
import java.util.HashSet;;

public class CommonElement {
    public static void main(String[] args) {
    int arr1[] = {1,1,4,5,3};
    int arr2[]= {2,2,3};

HashSet<Integer> box = new HashSet<>();
HashSet<Integer> result = new HashSet<>();

    int n = arr1.length;
    int m = arr2.length;

    
    for(int i =0; i < n; i ++){
       box.add(arr1[i]);
    }
    for(int j = 0; j < m; j++){
       if(box.contains(arr2[j])){
         result.add(arr2[j]);
         
       }
    }
    System.out.println(result);
    }
    
}
