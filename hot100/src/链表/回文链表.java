package 链表;

import java.util.ArrayDeque;
import java.util.Deque;

public class 回文链表 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static boolean isPalindrome(ListNode head) {
        if (head == null)
            return false;
        ListNode p = head;
        Deque<Integer> stack = new ArrayDeque<>();
        while (p!= null) {
            stack.offer(p.val);
            p = p.next;
        }
        while (stack.size() > 0){
            if (stack.peekLast()!= head.val)
                return false;
            stack.pollLast();
            head = head.next;
        }
        return true;
    }
}
