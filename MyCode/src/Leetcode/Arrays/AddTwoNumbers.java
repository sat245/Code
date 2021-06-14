package Leetcode.Arrays;

import LinkedList.ListNode;

/**
 * Data Structures & Algorithms
 * https://github.com/SatyamMishra245/Code/tree/master/MyCode
 *
 * @ author : satyam mishra
 * @ created : 11-04-2021
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        ListNode head = l3;
        int sum =0, carry=0;
        while (l1 != null || l2 !=null) {
            ListNode temp = new ListNode();
            if(l1 != null && l2 != null) {
                sum = l1.val + l2.val + carry;
                if(sum > 9) {
                    carry = sum /10;
                    sum = sum % 10;
                }else {
                    carry = 0;
                }
                temp.val = sum;
                temp.next = null;
                if(head==null) {
                    head = temp;
                    l3=head;

                } else {
                    head.next = temp;
                    head = head.next;
                }
               l1 = l1.next;
                l2=l2.next;
            } else

            if(l1 != null) {
                sum = l1.val  + carry;
                if(sum > 9) {
                    carry = sum /10;
                    sum = sum % 10;
                }else {
                    carry = 0;
                }
                temp.val = sum;
                temp.next = null;
                if(head==null) {
                    head = temp;

                } else {
                    head.next = temp;
                    head = head.next;
                }
                l1=l1.next;
            } else if(l2 != null) {
                sum = l2.val  + carry;
                if(sum > 9) {
                    carry = sum /10;
                    sum = sum % 10;
                }else {
                    carry = 0;
                }
                temp.val = sum;
                temp.next = null;
                if(head==null) {
                    head = temp;

                } else {
                    head.next = temp;
                    head = head.next;
                }
                l2 = l2.next;
            }

        }

        if(carry > 0) {
            ListNode temp = new ListNode();
            temp.val = carry;
            temp.next = null;
            head.next = temp;
        }
        return l3;
    }
    int solve(int A) {
        int height = 0;
        int countBlocks = 0;
        int blocks = 1;
        while(countBlocks<=Math.sqrt(A)){
            countBlocks+=blocks;
            blocks++;
            height++;
        }
        return height;
    }
}

//public class Solution {
//    public int solve(int[] A) {
//        int n = A.length;
//        double sum = 0;
//        double num = 0;
//        double l = 1;
//        double r = 0;
//        for(int i = 0;i<n;i++){
//            num = A[i]%1000000007;
//            num=(num%1000000007 * num%1000000007)%1000000007;
//            l= i+1;
//            r = n-i;
//            sum = ((sum%1000000007) + (((l*r)%1000000007)*(num))%1000000007)%1000000007;
//        }
//        return (int)sum%(1000000007);
//    }
//}
