package 链表;

public class 两两交换链表中的节点 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode(-1,head);
        ListNode res = temp;
        while (temp.next!= null && temp.next.next!= null) {
            ListNode first = temp.next;
            ListNode second = temp.next.next;
            temp.next = second;
            first.next = second.next;
            second.next = first;
            temp = first;
        }
        return res.next;
    }
}
