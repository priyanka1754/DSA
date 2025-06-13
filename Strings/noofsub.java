https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/

1967. Number of Strings That Appear as Substrings in Word


class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String s:patterns){
            if(word.contains(s)){
                c++;
            }
        }
        return c;
    }
}