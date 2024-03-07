package 二分查找;

public class 在排序数组中查找元素的第一个和最后一个位置 {
    public static void main(String[] args) {
        int[] ints = searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        int mid = 0;
        while(left <= right){
            mid = left + (right - left)/2;
            if(target > nums[mid]){
                left = mid + 1;
            }
            else if(target < nums[mid]){
                right = mid - 1;
            }
            else{
                left = mid;
                int l=left,r=left;
                while(l > 0 && nums[left]==nums[l-1]) l--;
                while(r < len - 1 && nums[left]==nums[r+1]) r++;
                int ans[] ={l,r};
                return ans;
            }
        }
        int ans[] ={-1,-1};
        return ans;
    }
}
