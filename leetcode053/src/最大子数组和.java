public class 最大子数组和 {
    public static void main(String[] args) {

    }

//    使用动态规划思想，遍历数组，每次选择前一种子数组的和加上当前元素与当前元素中较大的一个作为新的前缀和，
//    同时更新最大子数组的和。最后返回最大子数组的和。
//    public static int maxSubArray(int[] nums) {
//        int pre = 0, maxAns = nums[0];
//        for (int x : nums) {
//            pre = Math.max(pre + x, x);
//            maxAns = Math.max(maxAns, pre);
//        }
//        return maxAns;
//    }

//    这个函数是一个用来找到数组中最大连续子数组和的算法。函数maxSubArray调用getInfo函数来递归地获取数组区间的信息，
//    并通过pushUp函数将左右子数组的信息合并。最后返回合并后的信息中的mSum字段
//
//    public class Status {
//        public int lSum, rSum, mSum, iSum;
//
//        public Status(int lSum, int rSum, int mSum, int iSum) {
//            this.lSum = lSum;
//            this.rSum = rSum;
//            this.mSum = mSum;
//            this.iSum = iSum;
//        }
//    }
//
//    public int maxSubArray(int[] nums) {
//        return getInfo(nums, 0, nums.length - 1).mSum;
//    }
//
//    public Status getInfo(int[] a, int l, int r) {
//        if (l == r) {
//            return new Status(a[l], a[l], a[l], a[l]);
//        }
//        int m = (l + r) >> 1;
//        Status lSub = getInfo(a, l, m);
//        Status rSub = getInfo(a, m + 1, r);
//        return pushUp(lSub, rSub);
//    }
//
//    public Status pushUp(Status l, Status r) {
//        int iSum = l.iSum + r.iSum;
//        int lSum = Math.max(l.lSum, l.iSum + r.lSum);
//        int rSum = Math.max(r.rSum, r.iSum + l.rSum);
//        int mSum = Math.max(Math.max(l.mSum, r.mSum), l.rSum + r.lSum);
//        return new Status(lSum, rSum, mSum, iSum);
//    }

}
