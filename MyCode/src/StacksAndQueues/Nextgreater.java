package StacksAndQueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by i318862 on 04/02/18.
 */
public class Nextgreater {
    public static ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        int size=A.size();
        int count =size-1;
        ArrayList<Integer> b = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        if(size<1){
            return A;
        }
        if(size<2){
            b.add(-1);
            return b;
        }
        b.add(0,-1);
        stack.push(A.get(count));
        while (count>0){
            count--;
            int current=A.get(count);
            if(current>=stack.peek()){
                while (!stack.isEmpty() && current>=stack.peek()){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                    b.add(0,stack.peek());
                }else {
                    b.add(0,-1);

                }
                stack.push(current);

            }else{
                b.add(0,stack.peek());
                stack.push(current);
            }
        }
        return b;
    }

    public static void main(String [] args){

        Integer [] arr = {39, 27, 11, 4, 24, 32, 32, 1};
        ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println(nextGreater(b));

    }
}
