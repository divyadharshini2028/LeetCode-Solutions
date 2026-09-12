class Solution {
    public int xorOperation(int n, int start) {
        int ans=0;
        int res=0;
        for(int i=0;i<n;i++){
            ans=start+2*i;
            res=res^ans;
        }
        return res;       
    }
}//tc=o(n) sc=a(1)

/*class Solution {
    public int xorOperation(int n, int start) {
        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            ans[i]=start+2*i;
        }
        int res=0;
        for(int x:ans){
            res=res^x;
        }
        return res;       
    }
}//tc=o(n),sp=o(n)*/

