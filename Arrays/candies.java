https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

1431. Kids With the Greatest Number of Candies

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l=new ArrayList<>();
        int n=candies.length;
        int max=-1;
        for(int i=0;i<n;i++){
            max=Math.max(candies[i],max);
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                l.add(true);
            }else{
                l.add(false);
            }
        }
        return l;
    }
}