class Solution {
    public int removeDuplicates(int[] n) {
        int l=n.length;
        
        int left=0;
        //int right=1;
    
        for(int right=1;right<l;right++){
            if(n[right]!=n[left]){
                left++;
                n[left]=n[right];
            }
        }
        return left+1;
        
    }
}