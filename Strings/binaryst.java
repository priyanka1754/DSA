https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/

1784. Check if Binary String Has at Most One Segment of Ones

class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}