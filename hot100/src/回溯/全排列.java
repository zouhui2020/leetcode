package 回溯;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class 全排列 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> list = new ArrayDeque<>();
        dfs(res, nums, list);
        return res;
    }

    public void dfs(List<List<Integer>> res, int[] nums, Deque<Integer> list) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.addLast(nums[i]);
            dfs(res, nums, list);
            list.removeLast();
        }
    }
}
