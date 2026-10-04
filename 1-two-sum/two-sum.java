class Solution {
    public int[] twoSum(int[] nums, int target) {
       /* int[] a=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                   a[0]=i;
                   a[1]=j;
                   //break;
                   return a;
                }
            }
        }
        return a;
        */
        int l=nums.length;
        int [] ans=new int[2];

        HashMap<Integer,Integer> mp= new HashMap<>();

        for(int i=0;i<l;i++){   //O(N)
            int curr=nums[i];
            int need=target-curr;
            if(mp.containsKey(need)){   //O(0)
                ans[0]=i;
                ans[1]=mp.get(need);
                break;
            }
            mp.put(curr,i);
        }
        return ans;
    }
}