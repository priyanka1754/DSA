https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store/description/

2064. Minimized Maximum of Products Distributed to Any Store

class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1;
        int r=(int)Math.pow(10,5);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(mid,n,quantities)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }

    public static boolean isPossible(int mid,int n,int quantities[]){
        
        for(int i=0;i<quantities.length;i++){
            int cur=quantities[i];
            while(cur>=mid){
                cur-=mid;
                n--;
            }
            if(cur<mid && cur!=0){
                cur=0;
                n-=1;
            }
        }
        if(n<0){
            return false;
        }
        return true;
    }
}
