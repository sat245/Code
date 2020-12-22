package LinkedList;

/**
 * Created by satyam mishra, Data Structure on 21/01/18.
 */
public class ListCycle {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);
//        ListNode listNode2 = new ListNode(9);
//        ListNode listNode3 = new ListNode(1);

        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(0);
        ListNode listNode6 = new ListNode(1);
//        ListNode listNode7 = new ListNode(7);


//
//        listNode.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
//        listNode6.next = listNode7;


//        listNode = addTwoNumbers(listNode,listNode4);
        for (int i = 0; i < 4; i++) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }

}
