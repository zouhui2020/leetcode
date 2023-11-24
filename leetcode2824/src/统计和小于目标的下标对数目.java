import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 统计和小于目标的下标对数目 {
    public static void main(String[] args) {
//        Integer a[] ={1,3};
//        List<Integer> integers = Arrays.asList(a);
//        for (int i = 0; i < integers.size(); i++) {
//            System.out.println("integers.get(i) = " + integers.get(i));
//        }
//
//        Integer[] array = (Integer[]) integers.toArray();
//        System.out.println("array[0] = " + array[0]);

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3));

    }

    public static int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int res = 0;
        for (int i = 0, j = nums.size() - 1; i < j; i++) {
            while (i < j && nums.get(i) + nums.get(j) >= target) {
                j--;
            }
            res += j - i;
        }
        return res;
    }
}
