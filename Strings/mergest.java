//https://leetcode.com/problems/merge-strings-alternately/description/

//1768. Merge Strings Alternately

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int n=0;String re="";
        if(word1.length()<=word2.length()){
            n=word1.length();
            re=word2.substring(n,word2.length());
        }else {
            n=word2.length();
            re=word1.substring(n,word1.length());
        }
        for(int i=0;i<n;i++){
            char ch1=word1.charAt(i);
            char ch2=word2.charAt(i);
            sb.append(ch1);
            sb.append(ch2);
        }
        return sb.append(re).toString();
    }
}