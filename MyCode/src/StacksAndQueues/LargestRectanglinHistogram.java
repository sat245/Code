package StacksAndQueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by satyam mishra, Data Structure on 25/01/18.
 */
public class LargestRectanglinHistogram {

    public static void main(String [] args){
            Integer [] a= {2,1,5,6,2,3};

            ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(a));
        System.out.print(largestRectangleArea(arr));

    }
    public static int largestRectangleArea(ArrayList<Integer> A) {
        Stack<Integer> stack = new Stack<>();
        stack.push(A.get(0));
        int count=0,mArea=-1,area=0;
        for(int i=1;i<A.size();i++) {
            area=0;
            count=1;
            if(!stack.isEmpty() && stack.peek()<A.get(i)) {
                while (!stack.isEmpty() && stack.peek() < A.get(i)) {
                    count++;
                    stack.pop();

                }
                area = count * A.get(i);
                if (mArea < area) {
                    mArea = area;

                }
            }
                stack.push(A.get(i));


        }
        return mArea;
    }

}
