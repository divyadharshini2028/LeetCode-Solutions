class Solution {
    public int[] runningSum(int[] nums) {
        int l=nums.length;
        int[] ans=new int[l];
        ans[0]=nums[0];
        for(int i=1;i<l;i++){
            ans[i]=ans[i-1]+nums[i];
        }
        return ans;
    }
}

/*class Solution {
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
}*/

