1482. Minimum Number of Days to Make m Bouquets
https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int l=1;
        int temp=(int)Math.pow(10,9);
        int r=temp;
        while(l<=r){
           int mid=l+(r-l)/2;
            if(isPossible(bloomDay,m,k,mid)){
               r=mid-1; 
            }else{
                l=mid+1;
            }
        }
        if(l==temp+1){
            return -1;
        }
        return l;
    }

    public boolean isPossible(int bloomDay[],int m,int k,int day){
        int took=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                took++;
            }else{
                took=0;
            }
            if(took==k){
                m-=1;
                took=0;
            }
            if(m==0){
                return true;
            }
        }
        return false;
    }
}
