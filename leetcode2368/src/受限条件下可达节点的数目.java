import java.util.ArrayList;
import java.util.List;

public class 受限条件下可达节点的数目 {
    int cnt = 0;

    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        boolean[] isrestricted = new boolean[n];
        for (int x : restricted) {
            isrestricted[x] = true;
        }

        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<Integer>();
        }
        for (int[] v : edges) {
            g[v[0]].add(v[1]);
            g[v[1]].add(v[0]);
        }
        dfs(0, -1, isrestricted, g);
        return cnt;
    }

    public void dfs(int x, int f, boolean[] isrestricted, List<Integer>[] g) {
        cnt++;
        for (int y : g[x]) {
            if (y != f && !isrestricted[y]) {
                dfs(y, x, isrestricted, g);
            }
        }
    }

//    class Solution:
//    def reachableNodes(self, n: int, edges: List[List[int]], restricted: List[int]) -> int:
//    adj = defaultdict(set)
//        for a, b in edges:
//    adj[a].add(b)
//    adj[b].add(a)
//    visited = {0, *restricted}
//    q = deque((0,))
//    ans = 0
//            while q:
//    node = q.popleft()
//            for nei in filterfalse(visited.__contains__, adj[node]):
//            visited.add(nei)
//            q.append(nei)
//    ans += 1
//            return ans
}