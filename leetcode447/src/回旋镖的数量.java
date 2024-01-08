import java.util.HashMap;

public class 回旋镖的数量 {
    public int numberOfBoomerangs(int[][] points) {
        int ans = 0;
        // 在外面 new，比在内层循环 new 效率更高
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int[] p1 : points) {
            cnt.clear();
            for (int[] p2 : points) {
                int d2 = (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
                int c = cnt.getOrDefault(d2, 0);
                ans += c * 2;
                cnt.put(d2, c + 1);
            }
        }
        return ans;
    }
}