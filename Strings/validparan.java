https://leetcode.com/problems/valid-parentheses/description/

20. Valid Parentheses

class Solution {
    public boolean isValid(String s) {
        Stack st=new Stack();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                char top=(char)st.peek();
                if(top=='(' && ch==')'){
                    st.pop();
                }else if(top=='[' && ch==']'){
                    st.pop();
                }else if(top=='{' && ch=='}'){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty() ? true : false;
    }
}