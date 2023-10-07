import java.util.ArrayDeque;
import java.util.Deque;

public class 股票价格跨度 {
    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        System.out.println(stockSpanner.next(100)); // 返回 1
        System.out.println(stockSpanner.next(80));  // 返回 1
        System.out.println(stockSpanner.next(60));  // 返回 1
        System.out.println(stockSpanner.next(70));  // 返回 2
        System.out.println(stockSpanner.next(60));  // 返回 1
        System.out.println(stockSpanner.next(75));  // 返回 4 ，因为截至今天的最后 4 个股价 (包括今天的股价 75) 都小于或等于今天的股价。
        System.out.println(stockSpanner.next(85));  // 返回 6
    }


    //双端队列实现单调栈
    static class StockSpanner {

        Deque<int[]> stack;
        int idx;

        public StockSpanner() {
            stack = new ArrayDeque<int[]>();
            stack.push(new int[]{-1, Integer.MAX_VALUE});
            idx = -1;
        }

        public int next(int price) {
            idx++;
            while (price >= stack.peek()[1]) {
                stack.pop();
            }
            int ret = idx - stack.peek()[0];
            stack.push(new int[]{idx, price});
            return ret;
        }
    }
}
