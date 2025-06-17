//https://leetcode.com/problems/shuffle-string/description/


//1528. Shuffle String


class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb=new StringBuilder();
        HashMap<Integer,Character> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(indices[i],s.charAt(i));
        }
        // System.out.println(hm);
        for(int i=0;i<s.length();i++){
            sb.append(hm.get(i));
        }
        return sb.toString();
    }
}
