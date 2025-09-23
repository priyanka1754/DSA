// https://leetcode.com/problems/plus-one/description/

// 66. Plus One

class Solution {
    public int[] plusOne(int[] digits) {
        // Build the number as a string
        StringBuilder s = new StringBuilder();
        for (int d : digits) {
            s.append(d);
        }

        // Use BigInteger instead of int (safe for very large numbers)
        java.math.BigInteger num = new java.math.BigInteger(s.toString());
        num = num.add(java.math.BigInteger.ONE);

        // Convert back to string
        String res = num.toString();

        // Build answer array
        int[] ans = new int[res.length()];
        for (int i = 0; i < res.length(); i++) {
            ans[i] = res.charAt(i) - '0';  // convert char → int
        }

        return ans;
    }
}




class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;  
                return digits;
            }
            digits[i] = 0;    
        }
        
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
}
