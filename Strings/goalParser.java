https://leetcode.com/problems/goal-parser-interpretation/description/

1678. Goal Parser Interpretation

class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                sb.append('G');
            }else if(command.charAt(i)=='('){
                i++;
                if(command.charAt(i)==')'){
                    sb.append('o');
                }else{
                    sb.append("al");
                }
            }
        }
        return sb.toString();

        // return command.replace("()", "o").replace("(al)", "al");
    }
}