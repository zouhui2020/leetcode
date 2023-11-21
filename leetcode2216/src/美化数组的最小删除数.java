public class 美化数组的最小删除数 {
    public static void main(String[] args) {
        int[] nums = {2, 6, 2, 5, 8, 9, 7, 2, 2, 5, 6, 2, 2, 0, 6, 8, 7, 3, 9, 2, 1, 1, 3, 2, 6, 2, 4, 6, 5, 8, 4, 8, 7, 0, 4, 8, 7, 8, 4, 1, 1, 4, 0, 1, 5, 7, 7, 5, 9, 7, 5, 5, 8, 6, 4, 3, 6, 5, 1, 6, 7, 6, 9, 9, 6, 8, 6, 0, 9, 5, 6, 7, 6, 9, 5, 5, 7, 3, 0, 0, 5, 5, 4, 8, 3, 9, 3, 4, 1, 7, 9, 3, 1, 8, 8, 9, 1, 6, 0, 0
        };
        System.out.println(minDeletion(nums));
    }

    public static int minDeletion(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int result = 0;
        for (int i = 0, j = 1; j < nums.length; ) {
            if (nums[i] == nums[j]) {
                result++;
                j++;
            } else {
                if ((j - result) % 2 == 0) {
                    i = j;
                } else {
                    i = j + 1;
                }
                j = i + 1;
            }
        }
        if ((nums.length - result) % 2 == 0) {
            return result;
        } else {
            return result + 1;
        }
    }
}
