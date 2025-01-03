https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/

2529.Maximum Count of Positive Integer and Negative Integer


class Solution {
    public int maximumCount(int[] nums) {
        // int neg=0,pos=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<0){
        //         neg++;
        //     }if(nums[i]>0){
        //         pos++;
        //     }
        // }
        // return Math.max(neg,pos);

        int neg=bs(nums,0);
        int Leftof1=bs(nums,1);
        int pos=nums.length-Leftof1;
        return Math.max(neg,pos);

    }
    public static int bs(int nums[],int k){
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=k){
                r=mid-1;
            }
            else if(nums[mid]<k){
                l=mid+1;
            }
        }
        return l;
    }
}