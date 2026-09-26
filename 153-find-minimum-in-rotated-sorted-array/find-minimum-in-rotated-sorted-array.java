import java.util.Arrays;
class Solution {
    public int findMin(int[] nums) {
        //int l=nums.length;

        Arrays.sort(nums);

        return nums[0];
    }
}