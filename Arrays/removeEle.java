https://leetcode.com/problems/remove-element/

27. Remove Element

class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=nums.length-1;
        while(i<=j){
            if(nums[i]==val && nums[j]!=val){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            else if(nums[i]==val && nums[j]==val){
                j--;
            }else{
                i++;
            }
        }
        int c=0;
        for(int p=0;p<nums.length;p++){
            if(nums[p]!=val){
                c++;
            }
        }
        return c;
    }
}
