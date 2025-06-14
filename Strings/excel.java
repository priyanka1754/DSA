https://leetcode.com/problems/excel-sheet-column-title/description/

168. Excel Sheet Column Title

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            columnNumber-=1;
            int rem=columnNumber%26;
            char ch=(char)(rem+'A');
            sb.insert(0,ch);
            columnNumber/=26;
        }
        return sb.toString();
    }
}