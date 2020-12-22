package LinkedList;

/**
 * Created by satyam mishra, Data Structure on 19/01/18.
 */
public class ReverseLinkLisTII {

    public static  ListNode reverseBetween(ListNode A, int B, int C) {
        int size=1;
        ListNode pointer=A,initial=A;
        while (size<B){
            size++;
            initial=pointer;
            pointer=pointer.next;
        }
        ListNode nextPointer=null;
            if(pointer!=null) {
                nextPointer = pointer.next;
            }

        ListNode temp;
        while(size<C){
            size++;
            if(nextPointer!=null) {
                temp = nextPointer.next;

                nextPointer.next = pointer;

                pointer = nextPointer;
                nextPointer = temp;
            }
        }
        if(B!=1) {
            if (initial != null && initial.next != null) {
                initial.next.next = nextPointer;
                initial.next = pointer;
            }
        }else {
            initial.next=nextPointer;
            return pointer;
        }


    return A;
    }
    public static void main(String [] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(7);



//
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next=listNode4;
        listNode4.next = listNode5;
        listNode5.next=listNode6;
        listNode6.next=listNode7;


        listNode=reverseBetween(listNode,1,4);
        for (int i = 0; i < 7; i++) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }
}
