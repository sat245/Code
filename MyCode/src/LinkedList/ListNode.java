package LinkedList;

/**
 * Created by satyam mishra, Data Structure on 17/01/18.
 */
public class ListNode {
        public int val;
        public ListNode next;
        public ListNode() {}
        ListNode(int x) { val = x; next = null; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
