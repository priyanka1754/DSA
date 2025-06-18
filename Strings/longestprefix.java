//https://leetcode.com/problems/longest-common-prefix/description/

//14. Longest Common Prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for(int i = 0; i < str.length();i++){
            char curr = str.charAt(i);
            for(int j = 1; j < strs.length;j++){
                if(i == strs[j].length() || strs[j].charAt(i)!=curr){
                    return str.substring(0,i);
                }
            }
        }
        return str; 
    }
}