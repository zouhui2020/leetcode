public class 使二叉树所有路径值相等的的最小代价 {
    public static void main(String[] args) {
        float f1 = 1.0f - 0.5f;
        float f2 = 2.0f - 1.5f;
        System.out.println(
                f1 == f2 ? "true" : "false"
        );
    }
    public int minIncrements(int n, int[] cost) {
        int ans = 0;
        for (int i = n - 2; i > 0; i -= 2) {
            ans += Math.abs(cost[i] - cost[i + 1]);
            // 叶节点 i 和 i+1 的双亲节点下标为 i/2（整数除法）
            cost[i / 2] += Math.max(cost[i], cost[i + 1]);
        }
        return ans;
    }
}