package 二分查找;

public class 搜索二维矩阵 {
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}}, 3));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int x = matrix[0].length;
        int y = matrix.length;
        if(target < matrix[0][0] || target > matrix[y-1][x-1])
            return false;
        else{
            int mid = 0;
            int up = 0;
            int down = y - 1;
            while(down >= up){
                mid = up + (down - up)/2;
                if(matrix[mid][0] < target){
                    up = mid + 1;
                }
                else if(matrix[mid][0] > target){
                    down = mid - 1;
                }
                else{
                    return true;
                }
            }
            up--;
            if(matrix[up][x-1] < target){
                return false;
            }
            int mid2 = 0;
            int left = 0;
            int right = x - 1;
            while(right >= left){
                mid2 = left + (right - left)/2;
                if(matrix[up][mid2] < target){
                    left = mid2 + 1;
                }
                else if(matrix[up][mid2] > target){
                    right = mid2 - 1;
                }
                else{
                    return true;
                }
            }
            return false;
        }
    }
}
