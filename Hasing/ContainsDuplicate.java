package Hasing;
import java.util.HashSet;

public class ContainsDuplicate{
    public static void main(String[] args) {
        int [] arr = {1,2,3,3};
        int n = arr.length;
        int result = -1;

        HashSet<Integer> box = new HashSet<>();

        for(int i =0; i < n; i ++){
            box.add(arr[i]);
            if(box.contains(arr[i])){
                result = arr[i];
            }
        }
        System.out.println(result);
    }
}


