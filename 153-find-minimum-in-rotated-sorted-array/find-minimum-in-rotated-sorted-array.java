//import java.util.Arrays;
class Solution {
    public int findMin(int[] nums) {

        int l=nums.length;
        int left=0;
        int right=l-1;

        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){//minimum is definitely on the right side
                left=mid+1;
            }
            else{
                right=mid;//minimum is on the left side or could be mid itself
            }
        }
        return nums[left];
    }
}//TC: O(log n), SC: O(1)