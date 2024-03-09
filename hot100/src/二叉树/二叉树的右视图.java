package 二叉树;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class 二叉树的右视图 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque();
        List<Integer> res = new ArrayList();
        if(root == null) return res;
        queue.offerFirst(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            while(n > 0){
                TreeNode node =  queue.poll();
                n--;
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                if(n == 0){
                    res.add(node.val);
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
