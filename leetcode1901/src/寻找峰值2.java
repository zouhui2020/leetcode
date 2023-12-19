public class 寻找峰值2 {

    public int[] findPeakGrid2(int[][] mat) {
        int left = -1, right = mat.length - 1;
        while (left + 1 < right) {
            int i = (left + right) >>> 1;
            int j = indexOfMax(mat[i]);
            if (mat[i][j] > mat[i + 1][j]) {
                right = i; // 峰顶行号 <= i
            } else {
                left = i; // 峰顶行号 > i
            }
        }
        return new int[]{right, indexOfMax(mat[right])};
    }

    private int indexOfMax(int[] a) {
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[idx]) {
                idx = i;
            }
        }
        return idx;
    }

//    public int[] findPeakGrid(int[][] mat) {
//        int m = mat.length, n = mat[0].length;
//        int low = 0, high = m - 1;
//        while (low <= high) {
//            int i = (low + high) / 2;
//            int j = -1, maxElement = -1;
//            for (int k = 0; k < n; k++) {
//                if (mat[i][k] > maxElement) {
//                    j = k;
//                    maxElement = mat[i][k];
//                }
//            }
//            if (i - 1 >= 0 && mat[i][j] < mat[i - 1][j]) {
//                high = i - 1;
//                continue;
//            }
//            if (i + 1 < m && mat[i][j] < mat[i + 1][j]) {
//                low = i + 1;
//                continue;
//            }
//            return new int[]{i, j};
//        }
//        return new int[0]; // impossible
//    }

}