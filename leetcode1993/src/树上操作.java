import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class 树上操作 {

//            ["LockingTree", "lock", "unlock", "unlock", "lock", "upgrade", "lock"]
//            [[[-1, 0, 0, 1, 1, 2, 2]], [2, 2], [2, 3], [2, 2], [4, 5], [0, 1], [0, 1]]
    //深度优先遍历借助栈实现
    //广度优先遍历借助队列实现
    public static void main(String[] args) {
        int[] parent = {-1, 0, 0, 1, 1, 2, 2};
        LockingTree lockingTree = new LockingTree(parent);
        System.out.println(lockingTree.lock(2, 2));
        System.out.println(lockingTree.unlock(2, 3));
        System.out.println(lockingTree.unlock(2, 2));
        System.out.println(lockingTree.lock(4, 5));
        System.out.println(lockingTree.upgrade(0, 1));
        System.out.println(lockingTree.lock(0, 1));
    }

    static class LockingTree {
        private int[] parent;
        private int[] userList;
        private List<Integer>[] children;

        public LockingTree(int[] parent) {
            int n = parent.length;
            this.parent = parent;
            this.userList = new int[n];
            this.children = new List[n];
            for (int i = 0; i < n; i++) {
                this.children[i] = new ArrayList<Integer>();
//                if (parent[i] != -1) {
//                    children[parent[i]].add(i);
//                }
            }
            for(int i = 0; i < n; i++){
                if(parent[i] != -1){
                    children[parent[i]].add(i);
                }
            }
        }

        public boolean lock(int num, int user) {
            if (userList[num] == 0) {
                userList[num] = user;
                return true;
            } else
                return false;
        }

        public boolean unlock(int num, int user) {
            if (userList[num] == user) {
                userList[num] = 0;
                return true;
            } else
                return false;
        }


        public boolean upgrade(int num, int user) {
            if (userList[num] != 0) {
                return false;
            }

            // 判断它祖宗有没有lock
            int ancestor = num;
            while (parent[ancestor] != -1) {
                ancestor = parent[ancestor];
                if (userList[ancestor] != 0) {
                    return false;
                }
            }

            // 判断它子孙有没有没lock的
            Queue<Integer> queue = new ArrayDeque<>();
            queue.offer(num);
            boolean hasLockedDescendant = false;
            // 使用BFS遍历子孙节点
            while (!queue.isEmpty()) {
                for (int i : children[queue.poll()]) {
                    if (userList[i] != 0) {
                        userList[i] = 0;
                        hasLockedDescendant = true;
                    }
                    queue.offer(i);
                }
            }
            if (hasLockedDescendant) {
                userList[num] = user;
                return true;
            }
            return false;
        }


    }
}

