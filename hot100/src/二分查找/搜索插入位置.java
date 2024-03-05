package 二分查找;

public class 搜索插入位置 {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(target > nums[mid]){
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        return left;
    }
}
