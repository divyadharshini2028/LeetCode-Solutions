class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=nums.length;
        /*for(int i=0;i<l;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
        */
        int left=0;
        int right=l-1;
        int[] ans=new int[l];

        for(int i=l-1;i>=0;i--){
           int leftsq=nums[left]*nums[left];
           int rightsq=nums[right]*nums[right];
           

           if(leftsq>rightsq){
            ans[i]=leftsq;
            left++;
           }
           else{
            ans[i]=rightsq;
            right--;
           }
        }
        return ans;
    }
}//tc=o(n) sc=o(n);