/*class Solution {
    public int numIdenticalPairs(int[] nums) {
        int l=nums.length;
        int count=0;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
} tc=o(n2) sc=O(n2)*/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int x:nums){
            if(map.containsKey(x)){
                count+=map.get(x);
            }
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return count;
    }
}//tc=o(n) sc=O(n)