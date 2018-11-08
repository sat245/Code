package StacksAndQueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by i318862 on 24/01/18.
 */
public class NearestSmallerElement {

    public static void main(String [] args) {
        Integer [] a= {34, 35, 27, 42, 5, 28, 39, 20, 28 };

        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(a));
//        arr.add(0);
//        arr.add(4);
//
//        arr.add(7);
//
//        arr.add(9);
        System.out.print(prevSmaller(arr));
    }
    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        Stack <Integer>stack = new Stack();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-1);
        stack.push(A.get(0));

        for(int i=1;i<A.size();i++){
            int s=A.get(i);
            int x=-1;
            while (!stack.isEmpty() && stack.peek()>=s){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr.add(-1);
                stack.push(s);
            }else {
                arr.add(stack.peek());
                    //stack.pop();
                    stack.push(s);

            }


            }
        return arr;
        }
    }

