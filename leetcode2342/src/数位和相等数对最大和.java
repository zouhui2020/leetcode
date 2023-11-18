import java.util.Arrays;

public class 数位和相等数对最大和 {
    public static void main(String[] args) {
        int num[] ={18,43,36,13,7};
        System.out.println(maximumSum(num));
    }
//    public static int maximumSum(int[] nums) {
//        // 将整型数组中的每个数值变为其各位数字之和
//        int maxSum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++){
//                if(numSum(nums[i])==numSum(nums[j])&&i!=j){
//                    if(maxSum<(nums[i]+nums[j])){
//                        maxSum = nums[i]+nums[j];
//                    }
//                }
//            }
//        }
//        if(maxSum==0){
//            return -1;
//        }
//        return maxSum;
//
//    }
//    public static int numSum(int num) {
//        int sum = 0;
//        while (num != 0) {
//            sum += num % 10;
//            num /= 10;
//        }
//        return sum;
//    }

    public static int maximumSum(int[] nums) {
        int ans = -1;
        int[] mx = new int[82]; // 至多 9 个 9 相加
        for (int num : nums) {
            int s = 0; // num 的数位和
            for (int x = num; x > 0; x /= 10) { // 枚举 num 的每个数位
                s += x % 10;
            }
            if (mx[s] > 0) { // 说明左边也有数位和等于 s 的元素
                ans = Math.max(ans, mx[s] + num); // 更新答案的最大值
            }
            mx[s] = Math.max(mx[s], num); // 维护数位和等于 s 的最大元素
        }
        return ans;
    }
}
