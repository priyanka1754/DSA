https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           int x=target-nums[i];
           if(hm.containsKey(x)){
            a[0]=hm.get(x);
            a[1]=i;
           }
           hm.put(nums[i],i);
        }
        return a;
    }
}

//brute force
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }
}
