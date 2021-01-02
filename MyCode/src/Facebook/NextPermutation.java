package Facebook;
//Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
//
//        If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).
//
//        The replacement must be in place and use only constant extra memory.

import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }
        int len = nums.length - 1 ;
        int max = len,min = len;
        while (len >=0 ) {
           int current = len;
           if(nums[current] < nums[max] || nums[current] < nums[min]) {
               if (nums[current] < nums[min]) {
                   swap(nums, min, current);
                   return;
               }
               if(nums[current] < nums[max]) {
                   Arrays.sort(nums,current+1,nums.length);
                   for(int i = len;i<nums.length;i++) {
                       if(nums[current] < nums[i]) {
                           swap(nums, i, current);
                           return;
                       }
                   }
               }
           } else {
               if(nums[current] < nums[min]) {
                   min = current;
               }

               if(nums[current] > nums[max]) {
                   max = current;
               }
           }

            len--;

        }
        Arrays.sort(nums);
    }

    private static void swap(int[] nums, int min, int current) {
        int temp = nums[min];
        nums[min] = nums[current];
        nums[current] = temp;
        Arrays.sort(nums,current+1,nums.length);
    }

    public static void main(String [] args) {
       int nums[] = {4,2,0,2,3,2,0};
        nextPermutation(nums);
        System.out.println();
    }
}
