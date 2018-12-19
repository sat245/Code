package LinkedList;
//
//Given two numbers represented by two linked lists, write a function that returns sum list. The sum list is linked list representation of addition of two input numbers. It is not allowed to modify the lists. Also, not allowed to use explicit extra space (Hint: Use Recursion).
//
//        Example
//
//        Input:
//        First List: 5->6->3  // represents number 563
//        Second List: 8->4->2 //  represents number 842
//        Output
//        Resultant list: 1->4->0->5  // represents number 1405
public class AddTwoLinkedListWithRecursion {
    static ListNode root = new ListNode(0);
    public static ListNode fn(ListNode a,ListNode b){
        if(a.next==null && b.next==null){
            return new ListNode(0);
        }
        if(a!=null)
        a=a.next;

        if(b!=null)
        b=b.next;

        fn(a,b);

        ListNode temp = null;
        temp=root.next;
        int sum = (a.val+b.val)%10;
        int carry = (a.val+b.val)/10;
        root.next = new ListNode(sum+root.val);
        root.val = carry;
        root.next.next=temp;
        return root;
    }

    public static int sizeOF(ListNode  a){
        int size=0;
        while (a!=null){
            size=size+1;
            a=a.next;
        }
        return size;
    }

    public static ListNode additionLogic(ListNode a,ListNode b) {
        int sizea = sizeOF(a);
        int sizeb = sizeOF(b);
        if (sizea == sizeb) {
            return fn(a, b);

        } else {
            int difference = Math.abs(sizea - sizeb);
            ListNode root = null;
            ListNode temp = new ListNode(0);
            ListNode temp1 = temp;


            if (sizea > sizeb) {
                while (difference-- > 0) {
                    temp.next = new ListNode(a.val);
                    temp=temp.next;
                    a = a.next;
                }
                root = fn(a, b);
                root.val = (root.val+a.val+b.val);
                int carry = root.val/10;
                root.val%=10;
                temp.next = root;
            } else {
                while (difference-- > 0) {
                    temp.next = new ListNode(b.val);
                    temp=temp.next;
                    b = b.next;
                }
                root = fn(a, b);
                root.val = (root.val+a.val+b.val);
                int carry = root.val/10;
                root.val%=10;
                temp.next = root;
            }
            return temp1.next;

        }
    }

    public static void main(String []args){
        ListNode listNodeA = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(0);
        ListNode listNode6 = new ListNode(9);

        listNodeA.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = null;

        ListNode listNodeB = listNodeA.next;
        printList(listNodeA);printList(listNodeB);
        root=additionLogic(listNodeA,listNodeB);
        printList(root);
    }

    public static void printList(ListNode a){
        System.out.println("");
        while(a!=null){
            System.out.print(a.val+"-->");
            a=a.next;
        }
    }
}
