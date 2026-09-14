class Solution {
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
        String res="";
        for(int i=0;i<l;i++){
            char ch1=s.charAt(i);
            if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'){
               ch1=ans.charAt(l1-1-j);
               j++;
               res=res+ch1;
            }
            else{
            res=res+ch1;
            }
        }
        return res;
    }
}