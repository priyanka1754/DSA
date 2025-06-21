https://leetcode.com/problems/shuffle-the-array/description/

1470. Shuffle the Array

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]=new int[2*n];
        int j=nums.length-n;
        for(int i=0;i<n;i++){
                a[i*2]=nums[i];
                a[i*2+1]=nums[n+i];
        }
        return a;
    }
}