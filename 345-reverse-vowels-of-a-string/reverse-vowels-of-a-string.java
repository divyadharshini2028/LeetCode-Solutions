/*class Solution {
    public String reverseVowels(String s) {
        int l=s.length();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                ans.append(ch);
            }
        }
        int l1=ans.length();
        int j=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<l;i++){
            char ch1=s.charAt(i);
            if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'){
               ch1=ans.charAt(l1-1-j);
               j++;
               res.append(ch1);
            }
            else{
            res.append(ch1);
            }
        }
        return res.toString();
    }
}*/
/*class Solution {
     public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
    public String reverseVowels(String s) {
        int l=s.length();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                ans.append(ch);
            }
        }
        int l1=ans.length();
        int j=0;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<l;i++){
            char ch1=s.charAt(i);
            if(isVowel(ch1)){
               ch1=ans.charAt(l1-1-j);
               j++;
               res.append(ch1);
            }
            else{
            res.append(ch1);
            }
        }
        return res.toString();
    }
}//tc=o(n),sc=o(n);*/
class Solution {
     public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
    public String reverseVowels(String s) {
        char[] ans=s.toCharArray();
        int l=s.length();
        int left=0;
        int right=l-1;

        while(left<right){
            while(left<right && !isVowel(ans[left])){
                left++;
            }
            while(left<right && !isVowel(ans[right])){
                right--;
            }
            char temp=ans[left];
            ans[left]=ans[right];
            ans[right]=temp;

            left++;
            right--;
        }
        return new String(ans);
    }
}