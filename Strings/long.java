// https://leetcode.com/problems/long-pressed-name/description/

// 925. Long Pressed Name

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0,j=0;
        while(j<typed.length()){
            if(i<name.length() && name.charAt(i)==typed.charAt(j)){
                j++;
                i++;
            }else if(j>0 && typed.charAt(j)==typed.charAt(j-1)){
                j++;
            }else{
                return false;
            }
        }
        return i==name.length();
    }
}