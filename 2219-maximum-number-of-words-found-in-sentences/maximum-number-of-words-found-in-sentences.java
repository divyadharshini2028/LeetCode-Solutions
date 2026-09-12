class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String[] word=sentences[i].trim().split("\\s+");
            max=Math.max(max,word.length);
        }
        return max;
    }
}