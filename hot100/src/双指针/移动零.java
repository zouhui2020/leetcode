package 双指针;

public class 移动零 {
    public void moveZeroes(int[] nums) {
        if(nums==null) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
