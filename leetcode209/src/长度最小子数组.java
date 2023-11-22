public class 长度最小子数组 {
    public static void main(String[] args) {
        int [] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen2(7, nums));
    }
    public static int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (end < n) {
            sum += nums[end];
            while (sum >= s) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static int minSubArrayLen2(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = nums[0];
        int result = Integer.MAX_VALUE;
        for (int start = 0, end = 0; end < nums.length;end++) {
            sum += nums[end];
            while (sum >= s) {
                result = Math.min(result, end - start + 1);
                sum -= nums[start++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

//    数组越界问题(未解决)
//    public static int minSubArrayLen(int s, int[] nums) {
//        if (nums.length == 0) {
//            return 0;
//        }
//        int sum = nums[0];
//        int result = Integer.MAX_VALUE;
//        for (int start = 0, end = 0; end < nums.length;) {
//            if (sum < s){
//                sum += nums[++end];
//            }
//            else {
//                result = Math.min(result, end - start + 1);
//                sum -= nums[start++];
//            }
//        }
//        return result;
//    }
}
