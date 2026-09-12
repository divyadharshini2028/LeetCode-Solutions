/*class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String[] word=sentences[i].trim().split("\\s+");   // this is needed when there is a more than 1 space between word.loop run for each character
            max=Math.max(max,word.length);
        }
        return max;
    }
} tc=o(num of character) sc=o(max word)*/ 

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            int count=1;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    count++;
                }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}//tc=o(num of character) sc=o(1)