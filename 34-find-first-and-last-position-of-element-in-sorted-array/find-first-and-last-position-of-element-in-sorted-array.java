class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a=new int[2];
        Arrays.fill(a,-1);
        int l=nums.length;

        int left=0;
        int right=l-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else if(nums[mid]==target){
                a[0]=mid;
                right=mid-1;
            }        
        }
         left=0;
        right=l-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else if(nums[mid]==target){
                a[1]=mid;
                left=mid+1;
            }        
        }
        return a;
    }
}