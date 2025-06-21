https://leetcode.com/problems/build-array-from-permutation/description/

1920. Build Array from Permutation

class Solution {
    public int[] buildArray(int[] nums) {
        // int a[]=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     a[i]=nums[nums[i]];
        // }
        // return a;
         int n = nums.length;  

        // Step 1: Encode the results  
        for (int i = 0; i < n; i++) {  
            nums[i] += (nums[nums[i]] % n) * n;  
        }  

        // Step 2: Retrieve the results  
        for (int i = 0; i < n; i++) {  
            nums[i] /= n;  
        }  

        return nums; 
    }
}