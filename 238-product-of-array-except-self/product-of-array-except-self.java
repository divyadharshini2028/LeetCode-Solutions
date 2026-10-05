/*class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        left[0] = 1;
        right[n - 1] = 1;
        // Store products on the left
        for(int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        // Store products on the right
        for(int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        // Multiply left product and right product
        for(int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }
}*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
      int l=nums.length;
      int[] ans=new int[l];
      ans[0]=1;
       for(int i=1;i<l;i++){
        ans[i]=ans[i-1]*nums[i-1];   //left product
       }
       int right=1;
       for(int i=l-1;i>=0;i--){
        ans[i]=ans[i]*right;   //left*right product
        right=right*nums[i];   //right product;
       }
       return ans;
    }
}//TC: O(n), SC: O(1) auxiliary space