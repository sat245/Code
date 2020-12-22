package LinkedList;

/**
 * Created by satyam mishra, Data Structure on 21/01/18.
 */
public class AddTwoNumbersAsLists {
    public static ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode sum=A;
        ListNode result=sum;
        int carry=0; int s=0;
        while(A!=null && B!=null){
            s=A.val+B.val+carry;
            carry=0;
            if(s>9){
                carry=s/10;
                s=s%10;
            }
            A.val=s;
            sum=A;
            A=A.next;
            B=B.next;
        }
        while (A!=null){
            s=A.val+carry;
            carry=0;
            if(s>9){
                carry=s/10;
                s=s%10;
            }
            A.val=s;
            sum=A;
            A=A.next;

        }
        while (B!=null){
            s=B.val+carry;
            carry=0;
            if(s>9){
                carry=s/10;
                s=s%10;
            }
            sum.next=new ListNode(s);
            sum=sum.next;
            B=B.next;

        }
        if(carry>0){
            sum.next=new ListNode(carry);
        }
            return result;
        }
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


        listNode = addTwoNumbers(listNode,listNode4);
        for (int i = 0; i < 4; i++) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }
}
