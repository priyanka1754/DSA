1283. Find the Smallest Divisor Given a Threshold

https://leetcode.com/problems/find-the-smallest-
divisor-given-a-threshold/description/



class Solution {
    public static boolean isPossible(int mid,int[] nums,int threshold){
        
        for(int i=0;i<nums.length;i++){
            int c=(int)Math.ceil((float)nums[i]/mid);
            // int c=nums[i]/mid;
            // if(c%mid!=0){
            //     c++;
            // }
            threshold-=c;
        }
        if(threshold<0){
            return false;
        }else{
            return true;
        }
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int r=(int)Math.pow(10,6);
        // for(int num:nums){
        //     r=Math.max(r,num);
        // }
        int l=1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(mid,nums,threshold)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
1283. Find the Smallest Divisor Given a Threshold

https://leetcode.com/problems/find-the-smallest-
divisor-given-a-threshold/description/



class Solution {
    public static boolean isPossible(int mid,int[] nums,int threshold){
        
        for(int i=0;i<nums.length;i++){
            int c=(int)Math.ceil((float)nums[i]/mid);
            // int c=nums[i]/mid;
            // if(c%mid!=0){
            //     c++;
            // }
            threshold-=c;
        }
        if(threshold<0){
            return false;
        }else{
            return true;
        }
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int r=(int)Math.pow(10,6);
        // for(int num:nums){
        //     r=Math.max(r,num);
        // }
        int l=1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(mid,nums,threshold)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}