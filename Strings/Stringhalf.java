//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/

//1704. Determine if String Halves Are Alike

class Solution {
    public boolean halvesAreAlike(String s) {
        int i=0;
        int j=s.length()-1;
        String s1=s.toLowerCase();
        String s2="aeiou";
        int left=0,right=0;
        while(i<j){
            for(int l=0;l<s2.length();l++){
                if(s1.charAt(i) == s2.charAt(l)){
                    left++;
                }
               
                if(s1.charAt(j) == s2.charAt(l)){
                    right++;
                }
               
            }
             i++;
              j--;
        }
        return left==right;
    }
}
