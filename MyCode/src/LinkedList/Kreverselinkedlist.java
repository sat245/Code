package LinkedList;

import sun.jvm.hotspot.debugger.linux.x86.LinuxX86CFrame;

/**
 * Created by i318862 on 21/01/18.
 */
public class Kreverselinkedlist {
    public static ListNode reverseList(ListNode A, int B) {

        if(B==0 || B==1|| A==null || A.next==null){
            return A;
        }
        ListNode start=A;
        int size=size(A);

        for(int i=1;i<size;i+=B){
            A=reverseBetween(A,i,i+B-1);
        }

        return A;
    }
    public  static int size(ListNode A) {
        int x=0;
        while(A!=null){
            x++;
            A=A.next;
        }
        return x;
    }
    public   static ListNode reverseBetween(ListNode A, int B, int C) {
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

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
//
        ListNode listNode4 = new ListNode(4);
//        ListNode listNode5 = new ListNode(0);
//        ListNode listNode6 = new ListNode(1);
//        ListNode listNode7 = new ListNode(7);



        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        listNode5.next = listNode6;
//        listNode6.next = listNode7;


        listNode = reverseList(listNode,2);
        for (int i = 0; i < 4; i++) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }

}
