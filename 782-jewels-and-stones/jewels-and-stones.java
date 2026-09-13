/*class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int l1=jewels.length();
        int l2=stones.length();
        int count=0;
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}tc=o(n2)*/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set=new HashSet<>();
        int l1=jewels.length();
        int l2=stones.length();
        int count=0;
        for(int i=0;i<l1;i++){
            //if(!set.contains(jewels.charAt(i))){
                set.add(jewels.charAt(i));
            //}    no need because hashset itset add only unique
        }
        for(int j=0;j<l2;j++){
            if(set.contains(stones.charAt(j))){
                count++;
            }
        }
        return count;
    }
}//tc=o(n) sc=o(n);