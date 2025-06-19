https://leetcode.com/problems/length-of-last-word/description/

58. Length of Last Word

class Solution {
    public int lengthOfLastWord(String s) {
        String[] splitWords=s.split("\\s");
        return splitWords[splitWords.length-1].length();
    }
}