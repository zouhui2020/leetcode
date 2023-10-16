import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 只出现一次的数字3 {
    public static void main(String[] args) {
        int[] numbers = {1,2,1,3,2,5};
        int[] ints = singleNumber(numbers);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }


    public static int[] singleNumber(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums.length == 2){
            result.add(nums[0]);
            result.add(nums[1]);
        }
        else{
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 1; i++) {
                int temp = nums[i+1] - nums[i];
                if (temp != 0) {
                    result.add(nums[i]);
                }
                else {
                    i++;
                }
            }
        }
        if(result.size()==1){
            result.add(nums[nums.length-1]);
        }
        int[] ans = new int[2];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}
