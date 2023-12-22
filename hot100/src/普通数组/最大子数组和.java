package 普通数组;

public class 最大子数组和 {

//    public int maxSubArray(int[] nums) {
//        int result = nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for (int j = i ; j < nums.length; j++) {
//                sum += nums[j];
//                if (sum > result) {
//                    result = sum;
//                }
//            }
//        }
//        return result;
//    }

    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }


}
