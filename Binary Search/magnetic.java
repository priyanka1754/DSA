https://leetcode.com/problems/magnetic-force-between-two-balls/description/

1552. Magnetic Force Between Two Balls

class Solution {
    public int maxDistance(int[] position, int m) {
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=(l+r)/2;
            if(isPossible(position,m,mid)){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return r;
    }

    public boolean isPossible(int positions[],int m,int mid){
        Arrays.sort(positions);
        int prev=positions[0];
        m-=1;
        for(int i=1;i<positions.length;i++){
            int val=positions[i];
            if(val-prev>=mid){
                m-=1;
                prev=val;
            }
            if(m==0){
                return true;
            }
        }
        return false;
    }
}
