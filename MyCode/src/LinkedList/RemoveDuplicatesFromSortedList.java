package LinkedList;

/**
 * Created by satyam mishra, Data Structure on 18/01/18.
 */
public class RemoveDuplicatesFromSortedList {

    public static void main(String [] args){
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(1);
        listNode.next=listNode2;
        listNode2.next=listNode3;


        listNode=deleteDuplicates(listNode);
        for(int i =0;i<1;i++) {
            System.out.print(listNode.val);
            listNode=listNode.next;
        }



    }

    public static ListNode deleteDuplicates(ListNode A) {

        if(A.next==null || A==null)
            return A;
        ListNode p=A;

        while (p.next!=null){
            if(p.val==p.next.val){
                p.next=p.next.next;
            }else {
                p = p.next;
            }
        }
        return A;
    }

}
