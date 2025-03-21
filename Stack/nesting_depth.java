https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

1614. Maximum Nesting Depth of the Parentheses
  
class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)==')'){
                if(st.peek()=='('){
                    st.pop();
                }
            }
            ans=Math.max(ans,st.size());
        }
        return ans;
    }
}
