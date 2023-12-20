package 哈希;

import java.util.Arrays;

public class 最长连续序列 {
    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int res = 0;
        int temp = nums[0];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i!=0&&nums[i] == nums[i - 1]) {
                continue;
            }
            if (temp == nums[i]) {
                res++;
            } else {
                if (res > max) {
                    max = res;
                }
                res = 1;
                temp = nums[i];
            }
            temp++;
        }
        if (res > max) {
            max = res;
        }
        return max;
    }
}
