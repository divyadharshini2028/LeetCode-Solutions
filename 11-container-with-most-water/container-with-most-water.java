class Solution {
    public int maxArea(int[] h) {
        int l=h.length;
        int left=0;
        int right=l-1;
        int max=0;
        while(left<right){
            int width=0;
            width=right-left;
            int p=width*Math.min(h[left],h[right]);

            if(max<p){
                max=p;
            }
            if(h[left]<h[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}