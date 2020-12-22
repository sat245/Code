package LinkedList;

/**
 * Created by satyam mishra, Data Structure on 17/01/18.
 */
public class PalindromeList {
    public static void main(String [] args){
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(1);
        listNode.next=listNode2;
        listNode2.next=listNode3;

        System.out.print(lPalin(listNode));


    }

    public static int lPalin(ListNode A) {
        if(A==null){
            return 0;
        }
        if(A.next==null){
            return 1;
        }
        int size=1;
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
            size++;
        }
        ListNode obj1=new ListNode(pointer.val);
        obj1.next=pointer1;
        pointer1=obj1;
        pointer=A;
        for (int i=0;i<size;i++){
            if(pointer.val!=pointer1.val){
                return 0;
            }
            pointer=pointer.next;
            pointer1=pointer1.next;
        }
        return 1;
    }
}
