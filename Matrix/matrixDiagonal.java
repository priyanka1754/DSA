https://leetcode.com/problems/matrix-diagonal-sum/


class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            int j=n-i-1;
            if(i!=j){
                sum+=mat[i][j];
            }
        }
        return sum;
    }
}


//another approch
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i==n-j-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}
