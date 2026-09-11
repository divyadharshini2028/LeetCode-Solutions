import java.util.Arrays;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int l=nums.length;
        int[] ans=new int[l];
        int[] copy=nums.clone();
        Arrays.sort(copy);

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<l;i++){
            if(!map.containsKey(copy[i])){
                map.put(copy[i],i);
            }
        }
        for(int i=0;i<l;i++){
            ans[i]=map.get(nums[i]);
        }
        return ans;
    }
}
/*class Solution {
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
}*/