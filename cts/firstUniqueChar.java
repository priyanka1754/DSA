https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        //store characters in hm.
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        //check if the value of the key character is 1
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(hm.get(c)==1){
                return i;
            }
        }
        return -1;
    }
}


//another approch but tle for larger inputs..
class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    c++;
                }
            }
            if(c==0) return i;
        }
        return -1;
    }
}
