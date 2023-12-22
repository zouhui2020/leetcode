package 字串;

import java.util.Arrays;
import java.util.HashMap;

public class 和为k的子数组 {
//    public int subarraySum(int[] nums, int k) {
//        int result = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for (int j = i ; j < nums.length; j++) {
//                sum += nums[j];
//                if (sum == k) {
//                    result++;
//                }
//            }
//        }
//        return result;
//    }

    public int subarraySum(int[] nums, int k) {
        int count = 0, pre = 0;
        HashMap< Integer, Integer > mp = new HashMap < > ();
        mp.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if (mp.containsKey(pre - k)) {
                count += mp.get(pre - k);
            }
            mp.put(pre, mp.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
