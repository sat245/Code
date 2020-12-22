package LinkedList;

/**
 * Created by satyam mishra, Data Structure on 18/01/18.
 */
public class RemoveDuplicatesfromSortedListII {
    public static void main(String [] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(5);
        ListNode listNode7 = new ListNode(5);




        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next=listNode4;
        listNode4.next = listNode5;
               listNode5.next=listNode6;
        listNode6.next=listNode7;


        listNode=deleteDuplicates(listNode);
        for (int i = 0; i < 2; i++) {
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }

        public static ListNode deleteDuplicates(ListNode A) {
        if(A.next==null || A==null)
            return A;
        ListNode p=A;
            ListNode q=A;

        while (p.next!=null){
            if(p.val==p.next.val) {
                while ( p.next!=null && p.val == p.next.val) {
                    p = p.next;
                }
                if(A.equals(q)){
                    q=p.next;
                    A=q;
                }else {
                    q.next = p.next;
                    p = q;
                }
            }else {
                q=p;
                p=p.next;

            }

        }
        return A;

        }

    }
