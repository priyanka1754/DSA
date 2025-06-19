//https://leetcode.com/problems/roman-to-integer/description/

//13. Roman to Integer

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = hm.get(s.charAt(i));
            if (i < s.length() - 1 && curr < hm.get(s.charAt(i + 1))) {
                ans -= curr;
            } else {
                ans += curr;
            }
        }
        return ans;
    }
}

// class Solution {
//     public int romanToInt(String s) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         map.put('I', 1); map.put('V', 5);
//         map.put('X', 10); map.put('L', 50);
//         map.put('C', 100); map.put('D', 500); map.put('M', 1000);

//         int ans = 0;
//         int prev = 0;

//         for (int i = s.length() - 1; i >= 0; i--) {
//             int curr = map.get(s.charAt(i));
//             if (curr < prev) {
//                 ans -= curr;
//             } else {
//                 ans += curr;
//             }
//             prev = curr;
//         }

//         return ans;
//     }
// }
