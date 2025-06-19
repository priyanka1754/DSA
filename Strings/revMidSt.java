https://leetcode.com/problems/reverse-prefix-of-word/description/

2000. Reverse Prefix of Word

class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        String remString="";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                String newString=word.substring(0,i+1);
                sb.append(newString).reverse();
                remString=word.substring(i+1,word.length());
                break;
            }
            if(i==word.length()-1){
                return word;
            }
        }
        return sb.append(remString).toString();
    }
}