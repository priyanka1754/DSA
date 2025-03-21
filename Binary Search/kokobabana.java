875. Koko Eating Bananas

https://leetcode.com/problems/koko-eating-bananas/description/

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int r=(int)Math.pow(10,9);
        // int r=1000000000;
        int l=1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(mid,piles,h)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
     public static boolean isPossible(int mid,int[] nums,int h){
        
        for(int i=0;i<nums.length;i++){
            // int c=(int)Math.ceil((float)nums[i]/mid);
            int val=nums[i];
            int c=val/mid;
            if(val%mid!=0){
                c++;
            }
            h-=c;
            if(h<0){
            return false;
        }
        
    }
    return true;
}
