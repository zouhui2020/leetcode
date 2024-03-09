package 堆;

import java.util.PriorityQueue;

public class 数组中最大的第K个元素 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums) {
            queue.offer(num);
        }
        for (int i = 0; i < k - 1; i++) {
            queue.poll();
        }
        return queue.poll();
    }
}
