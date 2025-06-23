https://leetcode.com/problems/number-of-good-pairs/description/

1512. Number of Good Pairs

class Solution {
    public int numIdenticalPairs(int[] nums) {
        // int n=nums.length;
        // int c=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             c++;
        //         }
        //     }
        // }
        // return c;

        Arrays.sort(nums);
        int count = 0, same = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count += same;
                same++;
            } else {
                same = 1;
            }
        }
        return count;
    }
}