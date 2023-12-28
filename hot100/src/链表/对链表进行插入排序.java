package 链表;

public class 对链表进行插入排序 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode cur = head.next;
        ListNode last = head;
        while (cur!= null) {
            if (cur.val < last.val) {
                ListNode prev = dummyHead;
                while (prev.next.val <= cur.val) {
                    prev = prev.next;
                }
                last.next = cur.next;
                cur.next = prev.next;
                prev.next = cur;
                cur = last.next;
            } else {
                last =last.next;
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
}
