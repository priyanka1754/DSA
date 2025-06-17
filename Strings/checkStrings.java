//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/


//1662. Check If Two String Arrays are Equivalent


class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(String s:word1){
            sb1.append(s);
        }
        System.out.println(sb1);
        for(String s:word2){
            sb2.append(s);
        }
        System.out.println(sb2);
        return sb1.toString().equals(sb2.toString());
    }
}
