class Solution {
    public int[] runningSum(int[] nums) {
        int l=nums.length;
        int[] ans=new int[l];
        for(int i=0;i<l;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum+=nums[j];
            }
            ans[i]=sum;
        }
        return ans;
    }
}