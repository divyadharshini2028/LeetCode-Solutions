/*class Solution {
    public  void moveZeroes(int[] nums) {
        int l=nums.length;
        int left=0;

       for(int right=0;right<l;right++){
        if(nums[right]!=0){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
        }
       }
       // return;
    }
}//tc=o(n) sc=o(1)*/


class Solution {
    public  void moveZeroes(int[] nums) {
        int l=nums.length;
        
        int left=0;

        for(int right=0;right<l;right++){
            if(nums[right]!=0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
        }
       // return nums;
    }
}

















