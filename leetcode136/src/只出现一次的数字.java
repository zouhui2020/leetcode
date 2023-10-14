import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 只出现一次的数字 {
    public static void main(String[] args) {

    }

    public static int singleNumber(int[] nums) {
        int ans =nums[0];
        if(nums.length>1){
            for (int i = 1; i < nums.length; i++) {
                ans = nums[i]^nums[i+1];
            }
        }
        return ans;
    }


}
