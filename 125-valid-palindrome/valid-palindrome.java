class Solution {
    public boolean isPalindrome(String s) {
        int l=s.length();
        String ans="";
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
              ans=ans+Character.toLowerCase(ch);
            }
        }
        int l1=ans.length();
        //int f=0;
        for(int i=0;i<l1/2;i++){
            char left=ans.charAt(i);
            char right=ans.charAt(l1-1-i);
            if(left!=right){
                //f=1;
               return false;
            }
        }
        return true;
    }
}