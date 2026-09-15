class Solution {
    public int[] twoSum(int[] num, int target) {
        int l=num.length;
        int left=0;
        int right=l-1;
        //int[] a=new int[2];
        while(left<right){
         int sum=num[left]+num[right];
         if(sum==target){
            //a[0]=left+1;
            //a[1]=right+1;
            return new int[] {left+1,right+1}; //create and return array int
         }
         else if(sum<target){
            left++;
         }
         else if(sum>target){
            right--;
         }
        }
        return new int[] {-1,-1};//if no value is return ..ans is -1-1
    }
}//tc=o(n) sc=o(1)