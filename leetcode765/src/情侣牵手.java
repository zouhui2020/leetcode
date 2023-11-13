public class 情侣牵手 {
    public static void main(String[] args) {

    }

    public static int minSwapsCouples(int[] row) {
        int len = row.length;
        int N = len / 2;
        UnionFind unionFind = new UnionFind(N);
        for (int i = 0; i < len; i += 2) {
            unionFind.union(row[i] / 2, row[i + 1] / 2);
        }
        return N - unionFind.getCount();
    }

       private static class UnionFind {

        // 父节点数组，记录每个节点的父节点
        private int[] parent;

        // 组成的集合个数
        private int count;

        /**
         * 获取集合个数
         * @return 集合个数
         */
        public int getCount() {
            return count;
        }

        /**
         * 构造函数
         * @param n 构造集合的大小
         */
        public UnionFind(int n) {
            this.count = n;
            this.parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        /**
         * 查找节点所属的集合的根节点
         * @param x 要查找的节点
         * @return 根节点
         */
        public int find(int x) {
            while (x != parent[x]) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }

        /**
         * 合并两个集合
         * @param x 要合并的节点1
         * @param y 要合并的节点2
         */
        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }

            parent[rootX] = rootY;
            count--;
        }
    }

}
