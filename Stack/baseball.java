https://leetcode.com/problems/baseball-game/
682. Baseball Game


class Solution {

    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }else if(operations[i].equals("D")){
                int ele=st.peek()*2;
                st.push(ele);
            }else if(operations[i].equals("+")){
                int p1=st.pop();
                int p2=st.peek();
                st.push(p1);
                st.push(p1+p2);
            }else{
                st.push(Integer.valueOf(operations[i]));
            }
        }
        int ans=0;
        for(int a:st){
            ans+=a;
        }
        return ans;
    }
}