https://leetcode.com/problems/richest-customer-wealth/description/

1672. Richest Customer Wealth

class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
       
        int max_sum=0;
        for(int i=0;i<n;i++){
             int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            max_sum=Math.max(sum,max_sum);
        }
        return max_sum;
    }
}