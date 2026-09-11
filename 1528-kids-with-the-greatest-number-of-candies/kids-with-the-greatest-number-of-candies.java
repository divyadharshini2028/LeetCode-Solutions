class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        int max=candies[0];
        for(int x:candies){
            if(max<x){
                max=x;
            }
        }
        for(int x:candies){
            ans.add((x+extraCandies)>=max);
            /*if((x+extraCandies)>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }*/
        }
        return ans;
    }
}