package Facebook;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int right = 1,left = 0,current = nums[0];
        while (right < nums.length) {
            current = nums[left];
            while (right < nums.length && current == nums[right]) {
                right++;
            }
            if(right < nums.length && current != nums[right]) {
                nums[left+1] = nums[right];
                left++;
                current = nums[right];
                right++;
            }
        }
        return left+1;
    }
    public static void main(String [] args) {
        int nums[] = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
