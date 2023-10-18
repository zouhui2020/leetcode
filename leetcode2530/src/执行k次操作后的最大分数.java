import java.util.PriorityQueue;

public class 执行k次操作后的最大分数 {
    public static void main(String[] args) {
        int[] nums = {238838724,196963851,539418658,120132686,273213807,57187185,68854249,619718192};
        System.out.println(maxKelements(nums, 7));
    }

    public static long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int num : nums) {
            q.offer(num);
        }
        long ans = 0;
        for (int i = 0; i < k; ++i) {
            int x = q.poll();
            ans += x;
            q.offer((x + 2) / 3);
        }
        return ans;
    }


    //冒泡超时
//    public static long maxKelements(int[] nums, int k) {
//        long result = 0l;
//        for (int i = 0; i < k; i++) {
//            for (int j = nums.length-1; j > 0; j--) {
//                if (nums[j]-nums[j-1]>0){
//                    int temp = nums[j];
//                    nums[j] = nums[j-1];
//                    nums[j-1] = temp;
//                }
//            }
//            result += nums[0];
//            nums[0] = (int) Math.ceil(nums[0] / 3.0);
//        }
//        return result;
//    }
}
