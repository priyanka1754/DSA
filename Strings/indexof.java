https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

28. Find the Index of the First Occurrence in a String

class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            int i=haystack.indexOf(needle);
            System.out.println(i);
            return i;
        }
        return -1;
    }
}