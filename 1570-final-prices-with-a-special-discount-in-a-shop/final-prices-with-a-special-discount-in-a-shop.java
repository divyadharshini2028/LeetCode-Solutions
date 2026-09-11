class Solution {
    public int[] finalPrices(int[] prices) {

        int l=prices.length;
        int[] ans=new int[l];
        Stack<Integer> stack=new Stack<>();

        for(int i=l-1;i>=0;i--){
           while(!stack.isEmpty() && prices[i]<stack.peek()){
            stack.pop();     
           } 

            if(!stack.isEmpty() && prices[i]>=stack.peek()){ 
                ans[i]=prices[i]-stack.peek();
            }
            else{
                ans[i]=prices[i];
            }
           stack.push(prices[i]);
        }
        return ans;
    }
}

/*class Solution {
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
}*/