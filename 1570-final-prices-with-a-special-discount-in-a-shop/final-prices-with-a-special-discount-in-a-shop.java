class Solution {
    public int[] finalPrices(int[] prices) {
        int l=prices.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(prices[j]<=prices[i]){
                    prices[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}