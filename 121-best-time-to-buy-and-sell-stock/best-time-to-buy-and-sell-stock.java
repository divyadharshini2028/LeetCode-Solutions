class Solution {
    public int maxProfit(int[] prices) {
        int l=prices.length;
        int min=prices[0];
        int profit=0;
        for(int i=0;i<l;i++){
          if(min>prices[i]){
            min=prices[i];
          }
          else{
            int currprofit=prices[i]-min;
            if(currprofit>profit){
                profit=currprofit;
            }
          }
        }
        return  profit;      
    }
}//tc=o(n) sc=o(1);