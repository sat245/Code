package LinkedList;

/**
 * Created by satyam mishra, Data Structure on 04/02/18.
 */
public class Subtract {
    public static ListNode subtract(ListNode A) {
        int size=1;
        ListNode rev=new ListNode(A.val);
        ListNode pointer=A.next;
        while(pointer!=null){
            ListNode obj= new ListNode(pointer.val);
            obj.next=rev;
            rev=obj;
            pointer=pointer.next;
            size++;
        }
        pointer=A;
        int count=1;
        while (count<=(size/2) && pointer!=null){
            count++;
            pointer.val=rev.val-pointer.val;
            pointer=pointer.next;
            rev=rev.next;
        }

        return A;
    }
    public static void main(String [] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
//        ListNode listNode5 = new ListNode(5);
//        ListNode listNode6 = new ListNode(6);
//        ListNode listNode7 = new ListNode(7);



//
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next=listNode4;
//        listNode4.next = listNode5;
//        listNode5.next=listNode6;
//        listNode6.next=listNode7;


        listNode=subtract(listNode);
        for (int i = 0; i < 4; i++) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }

}
