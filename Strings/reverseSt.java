https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

557. Reverse Words in a String III

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();

        String star[]=s.split("\\s");
        for(String st:star){
            String reversedStr = new StringBuilder(st).reverse().toString();
            sb.append(reversedStr+" ");
        }
        return sb.toString().trim();
    }
}