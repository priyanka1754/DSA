https://leetcode.com/problems/sorting-the-sentence/description/


1859. Sorting the Sentence


import java.util.*;

class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        HashMap<Integer, String> map = new HashMap<>();
        
        for (String word : words) {
            int position = word.charAt(word.length() - 1) - '0';
            String actualWord = word.substring(0, word.length() - 1);
            map.put(position, actualWord);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=words.length;i++){
            sb.append(map.get(i)+" ");
        }
        return sb.toString().trim();
    }
}