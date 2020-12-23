package StacksAndQueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by satyam mishra, Data Structure on 26/01/18.
 */
public class SlidingWindowMaximum {
    public static void main(String[] args) {
//        Integer[] a = {2, 1, 5, 6, 2, 3};
        Integer [] a={648, 614, 490, 138, 657, 544, 745, 582, 738, 229, 775, 665, 876, 448, 4, 81, 807, 578, 712, 951, 867, 328, 308, 440, 542, 178, 637, 446, 882, 760, 354, 523, 935, 277, 158, 698, 536, 165, 892, 327, 574, 516, 36, 705, 900, 482, 558, 937, 207, 368};

        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(a));
        System.out.println(slidingMaximum(arr, 9));

    }


    public static ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
       if(A.size()<2 || B==1){
           return new ArrayList<Integer>(A);
       }
        int max = 0;
        int secondMax = 1;
        if(A.get(max)<A.get(secondMax)){
            secondMax=0;
            max=1;
        }
        for (int i = 1; i < B; i++) {
            if (A.get(i) > A.get(max)) {
                secondMax = max;
                max = i;
            } else if(A.get(i)>A.get(secondMax) && i!=max){
                secondMax=i;
            }


        }

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(A.get(max));

        for (int i = 1; i <= A.size() - B; i++) {
            if (max >= i) {
                if (A.get(i + B - 1) > A.get(max)) {
                    arr.add(A.get(i + B - 1));
                    secondMax=max;
                    max = i + B - 1;
                } else {
                    arr.add(A.get(max));
                    if (A.get(i + B - 1) > A.get(secondMax)) {
                        secondMax = i + B - 1;
                    }
                }
            } else {
                if (secondMax >= i) {
                    if (A.get(i + B - 1) > A.get(secondMax)) {
                        arr.add(A.get(i + B - 1));
                        secondMax=max;
                        max = i + B - 1;
                    } else {
                        arr.add(A.get(secondMax));
                        max = secondMax;
                    }
                } else {
                    max=i;
                    secondMax=(i+1)<A.size()?i+1:max;
                    if(A.get(max)<A.get(secondMax)){
                        secondMax=i;
                        max=i+1;
                    }
                    for (int j = i; j < i+B; j++) {
                        if (A.get(j) > A.get(max)) {
                            secondMax = max;
                            max = j;
                        }else if(A.get(j)>A.get(secondMax) && j!=max){
                            secondMax=j;
                        }
                    }
                    arr.add(A.get(max));

                }
            }
        }
        return arr;

    }
}
