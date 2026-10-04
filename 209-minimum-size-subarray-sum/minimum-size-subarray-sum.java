class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=nums.length;
        int left=0;
        int right=0;
        int min=Integer.MAX_VALUE;
        int sum=0;

        for(right=0;right<l;right++){
            sum=sum+nums[right];
            while(sum>=target){
                min=Math.min(min,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}//TC: O(n), SC: O(1)