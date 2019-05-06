package Competitions.Visa;

import LinkedList.ListNode;


import java.io.IOException;

public class LinkedListDelete {
    public static void main(String[] args) throws IOException {
        SinglyLinkedListNode listNodeA = new SinglyLinkedListNode(1);
        SinglyLinkedListNode listNode2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode listNode3 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode listNode4 = new SinglyLinkedListNode(4);
        SinglyLinkedListNode listNode5 = new SinglyLinkedListNode(0);
        SinglyLinkedListNode listNode6 = new SinglyLinkedListNode(9);

        listNodeA.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = null;



        SinglyLinkedListNode a =  removeNodes(listNodeA,3);
        while(a!=null){
            System.out.print(a.data+"-->");
            a=a.next;
        }

    }

    public static SinglyLinkedListNode removeNodes(SinglyLinkedListNode listHead, int x) {
        // Write your code here

        if(listHead==null){
            return listHead;
        }
        while (listHead.data>x){
            listHead = listHead.next;
        }
        SinglyLinkedListNode previous = listHead;
        SinglyLinkedListNode present = listHead.next;

        while (present !=null){
            if(present.data>x){
                previous.next = present.next;
                present = previous.next;
            }else {
                present = present.next;
                previous = previous.next;
            }
        }
        return listHead;
    }
}
