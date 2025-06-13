https://leetcode.com/problems/robot-return-to-origin/description/

657. Robot Return to Origin

public class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0, down = 0, left = 0, right = 0;
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            if (move == 'U') {
                up++;
            } else if (move == 'D') {
                down++;
            } else if (move == 'L') {
                left++;
            } else if (move == 'R') {
                right++;
            }
        }
        return up == down && left == right;
    }
}