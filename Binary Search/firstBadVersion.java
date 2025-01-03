https://leetcode.com/problems/first-bad-version/description/

278. First Bad Version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // int res=-1;
        // for(int i=1;i<=n;i++){
        //     boolean ans=isBadVersion(i);
        //     if(ans){
        //         res=i;
        //         break;
        //     }
        // }
        // return res;

        int l=1;
        int r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isBadVersion(mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        } 
        return l;       
    }
}