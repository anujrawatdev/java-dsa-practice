package Hasing;
import java.util.HashSet;

public class ContainsDuplicate{
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        int n = nums.length;
        int ans = -1;

        HashSet<Integer> box = new HashSet<>();

        for(int i = 0; i < n ; i++){
            
            if(box.contains(nums[i])){
                ans = nums[i];
                break;
            }

            box.add(nums[i]);
        }
        System.out.print(ans);
    }
}