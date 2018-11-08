package LinkedList;

/**
 * Created by i318862 on 20/01/18.
 */
public class ReorderList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
//        ListNode listNode3 = new ListNode(3);
//        ListNode listNode4 = new ListNode(4);
//        ListNode listNode5 = new ListNode(5);
//        ListNode listNode6 = new ListNode(6);
//        ListNode listNode7 = new ListNode(7);


//
//        listNode.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
////        listNode4.next = listNode5;
//        listNode5.next = listNode6;
//        listNode6.next = listNode7;


        listNode = reorderList(listNode);
        for (int i = 0; i < 2; i++) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }

    public static int size(ListNode A) {
        int x = 0;
        while (A != null) {
            x++;
            A = A.next;
        }
        return x;
    }

    public static ListNode reverse(ListNode A) {
        ListNode obj = new ListNode(A.val);
        ListNode pointer;
        ListNode pointer1;
        pointer1=obj;
        pointer=A.next;
        while(pointer.next!=null){
            ListNode obj1=new ListNode(pointer.val);
            obj1.next=pointer1;
            pointer1=obj1;
            pointer=pointer.next;
        }
        ListNode obj1=new ListNode(pointer.val);
        obj1.next=pointer1;
        pointer1=obj1;
        return pointer1;
    }

    public static ListNode reorderList(ListNode A) {
        int size = size(A);
        if(size<=1){
            return A;
        }
        ListNode B = reverse(A);
        ListNode pointerA = A;
        ListNode pointerB = B;
        ListNode temp1 = null;
        ListNode temp2 = null;
        int count = 0;
        while (count < (size / 2) && pointerB.next != null) {
            count++;
            if (count != (size / 2)) {
                temp1 = pointerA.next;
                temp2 = pointerB.next;
                pointerA.next = pointerB;
                pointerB.next = temp1;
                pointerA = temp1;
                pointerB = temp2;
            }
            if (count == (size / 2) && (size % 2) == 0) {
                temp1 = pointerA.next;
                temp2 = pointerB.next;
                pointerA.next = pointerB;
                pointerB.next = null;
            }
            if (count == (size / 2) && (size % 2) != 0) {
                temp1 = pointerA.next;
                temp2 = pointerB.next;
                pointerA.next = pointerB;
                pointerB.next = temp1;
                temp1.next = null;
                pointerB = temp1;

            }

        }
        return A;
    }

}
