https://leetcode.com/problems/repeated-substring-pattern/

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        int len=1;
        while(len<=n/2){
            String sub=s.substring(0,len);
            StringBuilder repString=new StringBuilder();
            if(n%len==0){
                int rep=n/len;
                for(int i=0;i<rep;i++){
                    repString.append(sub);
                }
                if(repString.toString().equals(s)) return true;
            }
            len++;
        }
        return false;
    }
}
