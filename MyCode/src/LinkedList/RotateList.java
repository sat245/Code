package LinkedList;

/**
 * Created by satyam mishra, Data Structure on 19/01/18.
 */
public class RotateList {
    public static int size(ListNode A) {
        int x=0;
        while(A!=null){
            x++;
            A=A.next;
        }
        return x;
    }
    public static ListNode rotateRight(ListNode A, int B) {
        int size=size(A);
        B=B%size;
        int count=1;
        ListNode pointer=A;
        while (count++<(size-B)){
           A=A.next;
        }
        ListNode pointer1=A;
        while (pointer1.next!=null){
            pointer1=pointer1.next;
        }
        pointer1.next=pointer;
        ListNode temp=A.next;
        A.next=null;
        return temp;

    }
    public static void main(String [] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
//        ListNode listNode4 = new ListNode(4);
//        ListNode listNode5 = new ListNode(5);
//        ListNode listNode6 = new ListNode(6);
//        ListNode listNode7 = new ListNode(7);



//
        listNode.next = listNode2;
        listNode2.next = listNode3;
//        listNode3.next=listNode4;
//        listNode4.next = listNode5;
//        listNode5.next=listNode6;
//        listNode6.next=listNode7;


        listNode=rotateRight(listNode,1);
        for (int i = 0; i < 3; i++) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }
}
