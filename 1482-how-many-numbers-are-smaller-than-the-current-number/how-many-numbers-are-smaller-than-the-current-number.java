class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int l=nums.length;
        int[] ans=new int[l];
        for(int i=0;i<l;i++){
            int cnt=0;
            for(int j=0;j<l;j++){
                if(nums[i]>nums[j]){
                    cnt++;
                }
            }
            ans[i]=cnt;
        }
        return ans;
    }
}