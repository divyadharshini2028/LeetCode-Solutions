class Solution {
    public int[] twoSum(int[] num, int target) {
        int l=num.length;
        int left=0;
        int right=l-1;
        int[] a=new int[2];
        for(int i=0;i<l;i++){
         int sum=num[left]+num[right];
         if(sum==target){
            a[0]=left+1;
            a[1]=right+1;
         }
         else if(sum<target){
            left++;
         }
         else if(sum>target){
            right--;
         }
        }
        return a;
    }
}