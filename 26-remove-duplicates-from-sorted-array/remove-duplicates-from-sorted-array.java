class Solution {
    public int removeDuplicates(int[] n) {
        int l=n.length;
        
        int left=0;
        //int right=1;
    
        for(int i=1;i<l;i++){
            if(n[i]!=n[left]){
                left++;
                n[left]=n[i];
            }
        }
        return left+1;
        
    }
}