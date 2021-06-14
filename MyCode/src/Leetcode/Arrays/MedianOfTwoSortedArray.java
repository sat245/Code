package Leetcode.Arrays;
// @ author: satyam mishra
// Median of Two Sorted Arrays
public class MedianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // if odd median is 1, else avg of 2 will be median



        if(nums1[0] <= nums2[0]) {

        }else {
            int [] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int len1 = nums1.length;
        int len2 = nums2.length;
        int mid1 = len1 + len2;
        int mid2 = -1;

        if(mid1%2==0) {
            mid1 = mid1/2;
            mid2 = mid1 + 1;
        } else {
            mid1 = 1+(mid1/2);
        }

        int h1; int num;
        if(len1 >= mid1) {
             h1 = mid1-1;
            num = nums1[mid1 - 1];
        } else {
           num = nums1[len1-1];
           h1 = len1-1;
        }
            int countOfSmallerNumbers = binarySearch(num,nums2);

            int h2 = countOfSmallerNumbers;
            if(len1+countOfSmallerNumbers+1 >= mid1) {
                while (len1+countOfSmallerNumbers+1 > mid1 && countOfSmallerNumbers-- >= 0) {
                    if (h1 >= 0 && h2 >= 0 && nums1[h1] > nums2[h2]) {
                        h1--;
                    } else {
                        h2--;
                    }
                }

                if(mid2 > 0) {
                    return (nums1[h1]+nums2[h2])/2;
                } else{
                    return nums1[h1]>nums2[h2]?nums1[h1]:nums2[h2];
                }

            } else {
                h1 = countOfSmallerNumbers+(mid1-countOfSmallerNumbers-len1);
                if(mid2 > 0) {
                    return (nums2[h1]+nums2[h1+1])/2;
                } else{
                    return nums2[h1];
                }
            }





    }

    private static int binarySearch(int num, int [] array) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left+right)/2;
            if(array[mid] > num) {
                right = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static  void main(String [] args) {
        int [] arr2 = {1,3};
        int [] arr1 = {2};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }

}
