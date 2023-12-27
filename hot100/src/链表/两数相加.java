package 链表;

public class 两数相加 {
    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        boolean flag = false;
        while (l1!= null || l2!= null) {
            int x = l1 == null? 0 : l1.val;
            int y = l2 == null? 0 : l2.val;
            int sum = x + y;
            if (flag) {
                sum++;
                flag = false;
            }
            if(sum >= 10)
            {
                flag = true;
            }
            ListNode node = new ListNode(sum % 10);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = tail.next;
            }
            if (l1!= null) {
                l1 = l1.next;
            }
            if (l2!= null) {
                l2 = l2.next;
            }
        }
        if (flag) {
            ListNode node = new ListNode(1);
            tail.next = node;
        }
        return head;
    }
}
