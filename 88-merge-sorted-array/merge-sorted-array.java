/*class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {
        int l=m+n;
        int left=0;
        int right=0;
        int[] ans=new int[l];
        for(int i=0;i<l;i++){
            if(left == m) {
                ans[i] = n2[right];
                right++;
            }
            else if(right == n) {
                ans[i] = n1[left];
                left++;
            }
            else if(n1[left]<=n2[right]){
               ans[i]=n1[left];
               left++;
            }
            else{
               ans[i]=n2[right];
               right++; 
            }
        }
         for(int i = 0; i < l; i++) {
            n1[i] = ans[i];
        }
    }
}*/
class Solution {
    public void merge(int[] n1, int m, int[] n2, int n) {

        int left = m - 1;
        int right = n - 1;
        int k = m + n - 1;

        while(left >= 0 && right >= 0) {

            if(n1[left] > n2[right]) {
                n1[k] = n1[left];
                left--;
            }
            else {
                n1[k] = n2[right];
                right--;
            }

            k--;
        }

        while(right >= 0) {
            n1[k] = n2[right];
            right--;
            k--;
        }
    }
}