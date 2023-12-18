public class 寻找峰值 {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    return i;
                }
            }
            return nums[nums.length - 1];
        }
    }
}
