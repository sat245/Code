package StacksAndQueues;

import java.util.Stack;

/**
 * Created by satyam mishra, Data Structure on 24/01/18.
 */
public class RedundantBraces {

    public static void main(String [] args) {
        System.out.println(braces("a + b"));
    }
    public static int braces(String A) {
        Stack<Character> stack = new Stack();
        Stack<Character> stack1 = new Stack();

        for (int i = 0; i < A.length(); i++) {
                stack1.push(A.charAt(i));

            if (A.charAt(i) == ')') {
                stack.push(A.charAt(i));
            }


        }
        if(stack.isEmpty()){
            return 0;
        }
        while(!stack.isEmpty() && !stack1.isEmpty()){
            stack.pop();
            stack1.pop();
        }
        if(stack.isEmpty() && stack1.isEmpty()){
            return 0;
        }
        if(stack.isEmpty() && !stack1.isEmpty()){
            return 0;
        }
        return 1;
    }

    }

